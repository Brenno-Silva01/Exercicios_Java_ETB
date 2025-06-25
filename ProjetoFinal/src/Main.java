import Telas.TelaPrincipal;
import Repository.GestorFinanceiro;

// Trabalho desenvolvido por Brenno e Karine - 2J
public class Main {
    public static void main(String[] args) {
        GestorFinanceiro gestor = new GestorFinanceiro();
        new TelaPrincipal(gestor);
    }
}

