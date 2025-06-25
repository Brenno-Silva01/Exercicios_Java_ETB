package Telas;

import Model.MovimentacaoFinanceira;
import Repository.GestorFinanceiro;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Tela principal do sistema de gestão de gastos mensais.
 * Exibe o saldo atual, histórico de movimentações e oferece botões para registrar receitas, despesas e visualizar o resumo mensal.
 */
public class TelaPrincipal extends JFrame {

    private GestorFinanceiro gestor;  // Responsável por gerenciar receitas, despesas e categorias
    private JLabel lblSaldo;          // Exibe o saldo atual formatado
    private JTextArea areaHistorico;  // Área de texto que mostra o histórico de movimentações

     //Construtor da tela principal.
    public TelaPrincipal(GestorFinanceiro gestor) {
        this.gestor = gestor;

        setTitle("Gestor de Gastos Mensais");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label de saldo atual no topo
        lblSaldo = new JLabel();
        lblSaldo.setFont(new Font("Arial", Font.BOLD, 18));
        atualizarSaldo(); // Atualiza com base nas movimentações existentes
        add(lblSaldo, BorderLayout.NORTH);

        // Área central de histórico de movimentações
        areaHistorico = new JTextArea();
        areaHistorico.setEditable(false);
        add(new JScrollPane(areaHistorico), BorderLayout.CENTER);

        // Painel inferior com botões de ação
        JPanel painelBotoes = new JPanel();
        JButton btnReceita = new JButton("Adicionar Receita");
        JButton btnDespesa = new JButton("Adicionar Despesa");
        JButton btnResumo = new JButton("Resumo Mensal");

        // Define ações dos botões
        btnReceita.addActionListener(e -> new FormularioReceita(this, gestor));
        btnDespesa.addActionListener(e -> new FormularioDespesa(this, gestor));
        btnResumo.addActionListener(e -> new TelaResumoMensal(this, gestor));

        // Adiciona os botões ao painel
        painelBotoes.add(btnReceita);
        painelBotoes.add(btnDespesa);
        painelBotoes.add(btnResumo);
        add(painelBotoes, BorderLayout.SOUTH);

        // Inicializa o histórico ao abrir a aplicação
        atualizarHistorico();

        setVisible(true); // Exibe a tela
    }

    /**
     * Atualiza a exibição do saldo atual com formatação monetária brasileira.
     * Usa cores diferentes para saldo positivo (azul) ou negativo (vermelho).
     */
    public void atualizarSaldo() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        double saldo = gestor.calcularSaldo();
        String saldoFormatado = formatoMoeda.format(saldo);

        lblSaldo.setText("Saldo Atual: " + saldoFormatado);

        // Muda a cor do texto conforme o saldo
        if (saldo < 0) {
            lblSaldo.setForeground(Color.RED);
        } else {
            lblSaldo.setForeground(Color.BLUE);
        }
    }

    /**
     * Atualiza a área de histórico com todas as movimentações registradas no sistema.
     * Inclui o tipo (receita/despesa), descrição, valor, data, status e categoria.
     */
    public void atualizarHistorico() {
        StringBuilder sb = new StringBuilder();
        sb.append("============== BEM-VINDO AO SEU GESTOR DE GASTOS ==============\n");

        for (MovimentacaoFinanceira m : gestor.listar()) {
            // Define o tipo da movimentação
            String tipo = (m instanceof Model.Receita) ? "[RECEITA]" : "[DESPESA]";

            // Linha principal: tipo, descrição, valor e data
            sb.append(tipo).append(" ").append(m.getDescricao()).append("\n")
                    .append("Valor: R$ ").append(m.calcularImpactoNoSaldo())
                    .append(" | Data: ").append(m.data);

            // Status específico de Receita ou Despesa
            if (m instanceof Model.Receita) {
                Model.Receita r = (Model.Receita) m;
                sb.append(" | Status: ").append(r.getStatus());
            } else if (m instanceof Model.Despesa) {
                Model.Despesa d = (Model.Despesa) m;
                sb.append(" | Status: ").append(d.getStatus());
            }

            // Categoria
            sb.append(" | Categoria: ").append(m.getCategoria().getNome()).append("\n");
            sb.append("--------------------------------------------------------------\n");
        }

        // Exibe o histórico na área de texto
        areaHistorico.setText(sb.toString());
    }
}
