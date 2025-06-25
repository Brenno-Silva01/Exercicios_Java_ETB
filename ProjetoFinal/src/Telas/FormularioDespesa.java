package Telas;

import Enums.StatusPagamento;
import Model.Categoria;
import Model.Despesa;
import Repository.GestorFinanceiro;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

/**
 * Tela de formulário para o cadastro de uma nova Despesa.
 * Permite ao usuário inserir os dados de uma despesa, incluindo valor, meio de pagamento, status e categoria.
 */
public class FormularioDespesa extends JDialog {

    //Construtor da tela de cadastro de despesa.
    public FormularioDespesa(TelaPrincipal parent, GestorFinanceiro gestor) {
        super(parent, "Nova Despesa", true); // Define o título e comportamento modal
        setSize(400, 300);                   // Tamanho da janela
        setLayout(new GridLayout(0, 1));     // Layout vertical em colunas

        // Campos do formulário
        JTextField txtDesc = new JTextField();                      // Campo para descrição da despesa
        JTextField txtValor = new JTextField();                     // Campo para valor da despesa
        JTextField txtMeio = new JTextField();                      // Campo para meio de pagamento
        JComboBox<StatusPagamento> comboStatus = new JComboBox<>(StatusPagamento.values()); // Combo para status da despesa
        JComboBox<Categoria> comboCategoria = new JComboBox<>();   // Combo para seleção de categoria

        // Preenche o comboBox com as categorias disponíveis no sistema
        for (Categoria c : gestor.getCategorias()) {
            comboCategoria.addItem(c);
        }

        // Adiciona os componentes visuais ao formulário
        add(new JLabel("Descrição:"));
        add(txtDesc);

        add(new JLabel("Valor:"));
        add(txtValor);

        add(new JLabel("Meio de Pagamento:"));
        add(txtMeio);

        add(new JLabel("Status:"));
        add(comboStatus);

        add(new JLabel("Categoria:"));
        add(comboCategoria);

        // Botão de salvar a despesa
        JButton btnSalvar = new JButton("Salvar");

        // Ação ao clicar no botão "Salvar"
        btnSalvar.addActionListener(e -> {
            try {
                // Recupera os dados inseridos pelo usuário
                String desc = txtDesc.getText();
                double valor = Double.parseDouble(txtValor.getText());
                String meio = txtMeio.getText();
                StatusPagamento status = (StatusPagamento) comboStatus.getSelectedItem();
                Categoria categoriaSelecionada = (Categoria) comboCategoria.getSelectedItem();

                // Cria o objeto Despesa com os dados fornecidos
                Despesa despesa = new Despesa(
                        gestor.listar().size() + 1, // Gera um ID simples baseado na quantidade atual
                        desc,
                        valor,
                        LocalDate.now(), // Data atual como data da despesa
                        "",
                        categoriaSelecionada,
                        meio
                );

                // Marca como paga se o status for PAGO
                if (status == StatusPagamento.PAGO) {
                    despesa.marcarComoPaga();
                }

                // Registra e adiciona a despesa ao gestor
                despesa.registrar();
                gestor.adicionar(despesa);

                // Atualiza a tela principal com o novo saldo e histórico
                parent.atualizarSaldo();
                parent.atualizarHistorico();

                // Fecha o formulário
                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar Despesa.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(btnSalvar);                   // Adiciona o botão à interface
        setLocationRelativeTo(parent);    // Centraliza o formulário na tela principal
        setVisible(true);                 // Exibe o formulário
    }
}
