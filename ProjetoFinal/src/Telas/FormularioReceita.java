package Telas;

import Enums.StatusRecebimento;
import Model.Categoria;
import Model.Receita;
import Repository.GestorFinanceiro;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

/**
 * Tela de formulário para o cadastro de uma nova Receita.
 * Permite ao usuário inserir os dados de uma receita, incluindo valor, fonte, status e categoria.
 */
public class FormularioReceita extends JDialog {

     // Construtor da tela de cadastro de receita.
    public FormularioReceita(TelaPrincipal parent, GestorFinanceiro gestor) {
        super(parent, "Nova Receita", true); // Define o título da janela e comportamento modal
        setSize(400, 300);                   // Define o tamanho da janela
        setLayout(new GridLayout(0, 1));     // Layout vertical em colunas (automático)

        // Campos do formulário
        JTextField txtDesc = new JTextField();                         // Campo para descrição da receita
        JTextField txtValor = new JTextField();                        // Campo para valor da receita
        JTextField txtFonte = new JTextField();                        // Campo para origem da receita (fonte)
        JComboBox<StatusRecebimento> comboStatus = new JComboBox<>(StatusRecebimento.values()); // Combo de status
        JComboBox<Categoria> comboCategoria = new JComboBox<>();       // Combo para categoria da receita

        // Preenche o comboBox com as categorias disponíveis no sistema
        for (Categoria c : gestor.getCategorias()) {
            comboCategoria.addItem(c);
        }

        // Adiciona os componentes de entrada e seus rótulos na tela
        add(new JLabel("Descrição:"));
        add(txtDesc);

        add(new JLabel("Valor:"));
        add(txtValor);

        add(new JLabel("Fonte:"));
        add(txtFonte);

        add(new JLabel("Status:"));
        add(comboStatus);

        add(new JLabel("Categoria:"));
        add(comboCategoria);

        // Botão de ação para salvar a receita cadastrada
        JButton btnSalvar = new JButton("Salvar");

        // Ação ao clicar no botão "Salvar"
        btnSalvar.addActionListener(e -> {
            try {
                // Coleta os dados inseridos pelo usuário
                String desc = txtDesc.getText();
                double valor = Double.parseDouble(txtValor.getText());
                String fonte = txtFonte.getText();
                StatusRecebimento status = (StatusRecebimento) comboStatus.getSelectedItem();
                Categoria categoriaSelecionada = (Categoria) comboCategoria.getSelectedItem();

                // Cria uma nova instância de Receita com os dados preenchidos
                Receita receita = new Receita(
                        gestor.listar().size() + 1, // ID gerado com base na lista
                        desc,
                        valor,
                        LocalDate.now(),            // Usa a data atual
                        "",
                        categoriaSelecionada,
                        fonte
                );

                // Marca como recebida se o status for RECEBIDO
                if (status == StatusRecebimento.RECEBIDO) {
                    receita.marcarComoRecebida();
                }

                // Registra e adiciona a receita ao gestor
                receita.registrar();
                gestor.adicionar(receita);

                // Atualiza a tela principal com novo saldo e histórico
                parent.atualizarSaldo();
                parent.atualizarHistorico();

                // Fecha a janela após salvar
                dispose();

            } catch (Exception ex) {
                // Exibe erro em caso de falha no preenchimento
                JOptionPane.showMessageDialog(this, "Erro ao salvar Receita.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Adiciona o botão de salvar na interface
        add(btnSalvar);

        // Centraliza a janela na tela principal
        setLocationRelativeTo(parent);
        setVisible(true); // Exibe o formulário
    }
}
