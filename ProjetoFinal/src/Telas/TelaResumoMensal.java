package Telas;

import Model.MovimentacaoFinanceira;
import Repository.GestorFinanceiro;

import javax.swing.*;
import java.awt.*;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tela para exibição de um resumo mensal das receitas e despesas.
 * Permite ao usuário digitar um mês e ano para ver o total de receitas, despesas e o saldo do período.
 */
public class TelaResumoMensal extends JDialog {

     //Construtor da tela de resumo mensal.
    public TelaResumoMensal(TelaPrincipal parent, GestorFinanceiro gestor) {
        super(parent, "Resumo Mensal", true); // Título e modal
        setSize(400, 300);                    // Define o tamanho da janela
        setLayout(new BorderLayout());        // Usa layout principal com áreas (NORTH, CENTER, SOUTH)

        // Painel superior com campos para busca por mês e ano
        JPanel painelBusca = new JPanel(new GridLayout(0, 2));
        JTextField txtMes = new JTextField();  // Campo para mês
        JTextField txtAno = new JTextField();  // Campo para ano

        painelBusca.add(new JLabel("Mês (1-12):"));
        painelBusca.add(txtMes);
        painelBusca.add(new JLabel("Ano:"));
        painelBusca.add(txtAno);

        // Área central onde será exibido o resultado do resumo
        JTextArea areaResultado = new JTextArea();
        areaResultado.setEditable(false); // Somente leitura

        add(painelBusca, BorderLayout.NORTH);                   // Parte superior
        add(new JScrollPane(areaResultado), BorderLayout.CENTER); // Centro com barra de rolagem

        // Botão inferior para executar a busca
        JButton btnBuscar = new JButton("Buscar");

        // Ação executada ao clicar no botão "Buscar"
        btnBuscar.addActionListener(e -> {
            try {
                // Recupera e converte os valores dos campos de entrada
                int mes = Integer.parseInt(txtMes.getText());
                int ano = Integer.parseInt(txtAno.getText());

                // Cria um objeto que representa o período (ano e mês)
                YearMonth periodo = YearMonth.of(ano, mes);

                // Filtra todas as movimentações que pertencem ao mês e ano escolhidos
                List<MovimentacaoFinanceira> filtradas = gestor.listar().stream()
                        .filter(mov -> YearMonth.from(mov.data).equals(periodo))
                        .collect(Collectors.toList());

                // Conta o número de receitas e despesas
                long totalReceitas = filtradas.stream().filter(mov -> mov instanceof Model.Receita).count();
                long totalDespesas = filtradas.stream().filter(mov -> mov instanceof Model.Despesa).count();

                // Calcula o saldo do período
                double saldoMes = filtradas.stream()
                        .mapToDouble(MovimentacaoFinanceira::calcularImpactoNoSaldo)
                        .sum();

                // Monta o resumo em forma de texto
                StringBuilder sb = new StringBuilder();
                sb.append("===== RESUMO DE ").append(periodo.getMonth()).append("/").append(ano).append(" =====\n\n");
                sb.append("Total de Receitas: ").append(totalReceitas).append("\n");
                sb.append("Total de Despesas: ").append(totalDespesas).append("\n");
                sb.append("Saldo no período: R$ ").append(saldoMes).append("\n\n");

                // Lista as receitas do período
                sb.append("--- RECEITAS ---\n");
                filtradas.stream()
                        .filter(mov -> mov instanceof Model.Receita)
                        .forEach(m -> {
                            Model.Receita r = (Model.Receita) m;
                            sb.append("\nDescrição: ").append(r.getDescricao())
                                    .append("\nValor R$: ").append(r.getValor())
                                    .append("\nData: ").append(r.data)
                                    .append("\nStatus: ").append(r.getStatus())
                                    .append("\n");
                        });

                // Lista as despesas do período
                sb.append("\n--- DESPESAS ---\n");
                filtradas.stream()
                        .filter(mov -> mov instanceof Model.Despesa)
                        .forEach(m -> {
                            Model.Despesa d = (Model.Despesa) m;
                            sb.append("\nDescrição: ").append(d.getDescricao())
                                    .append("\nValor R$: ").append(d.getValor())
                                    .append("\nData: ").append(d.data)
                                    .append("\nStatus: ").append(d.getStatus())
                                    .append("\n");
                        });

                // Exibe o texto no campo de resultado
                areaResultado.setText(sb.toString());

            } catch (Exception ex) {
                // Trata entradas inválidas (por exemplo, letras ou mês fora do intervalo)
                JOptionPane.showMessageDialog(this, "Dados inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Adiciona o botão ao rodapé da janela
        add(btnBuscar, BorderLayout.SOUTH);

        // Centraliza a janela na tela
        setLocationRelativeTo(parent);

        // Exibe a janela
        setVisible(true);
    }
}
