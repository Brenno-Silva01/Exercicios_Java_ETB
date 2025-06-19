package exercicio01L05;

public class TesteSoma {
    public static void main(String[] args) {
        Soma soma = new Soma(); // cria instância da classe Soma

        // Declara várias variáveis
        byte b = 20;
        short s = 99;
        int i = 1000;
        long l = 1234L;
        float f = 3.1416f;
        double d = 2000;

        // Chama vários métodos da classe Soma
        System.out.println(soma.doisValores(b,s)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(i,s)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(i,i)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(l,b)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(f,s)); // Método (2) - soma um double e um inteiro
        System.out.println(soma.doisValores(d,b)); // Método (2) - soma um double e um inteiro
        System.out.println(soma.doisValores(b,d)); // Método (3) - soma dois doubles
        System.out.println(soma.doisValores(i,l)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(l,l)); // Método (1) - soma dois inteiros
        System.out.println(soma.doisValores(d,f)); // Método (3) - soma dois doubles
    }
}
