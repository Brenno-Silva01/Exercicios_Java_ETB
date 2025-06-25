package Repository;

import Model.MovimentacaoFinanceira;
import Model.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar as movimentações financeiras e categorias do sistema.
 * Atua como repositório central da aplicação.
 */
public class GestorFinanceiro {

    // Lista de todas as movimentações financeiras (receitas e despesas)
    private List<MovimentacaoFinanceira> movimentacoes = new ArrayList<>();

    // Lista de categorias disponíveis para classificar movimentações
    private List<Categoria> categorias = new ArrayList<>();

    /**
     * Construtor da classe.
     * Inicializa as categorias padrão que estarão disponíveis no sistema.
     */
    public GestorFinanceiro() {
        // Categorias padrão pré-definidas
        categorias.add(new Categoria(1, "Despesa Geral", "Gastos mensais"));
        categorias.add(new Categoria(2, "Receita Geral", "Ganhos mensais"));
        categorias.add(new Categoria(3, "Alimentação", "Gastos com comida"));
        categorias.add(new Categoria(4, "Transporte", "Gastos com deslocamento"));
        categorias.add(new Categoria(5, "Lazer", "Gastos com lazer"));
        categorias.add(new Categoria(6, "Saúde", "Gastos com saúde"));
        categorias.add(new Categoria(7, "Educação", "Gastos com educação"));
    }

    //Adiciona uma nova movimentação financeira (receita ou despesa) à lista de movimentações.
    public void adicionar(MovimentacaoFinanceira mov) {
        movimentacoes.add(mov);
    }

    //Retorna a lista de todas as movimentações registradas.
    public List<MovimentacaoFinanceira> listar() {
        return movimentacoes;
    }

    //Calcula o saldo atual somando todas as receitas e subtraindo todas as despesas
    public double calcularSaldo() {
        return movimentacoes.stream().mapToDouble(MovimentacaoFinanceira::calcularImpactoNoSaldo).sum();
    }

    //Retorna a lista de categorias cadastradas.
    public List<Categoria> getCategorias() {
        return categorias;
    }
}
