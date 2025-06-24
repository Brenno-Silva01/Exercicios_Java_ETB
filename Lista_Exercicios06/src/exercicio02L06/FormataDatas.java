package exercicio02L06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormataDatas {
    public static void main(String[] args) {

        Date data = new Date(109, 4, 18); // (Ano - 1900), (Mês - 1), Dia

        // Formato 18/05/2009
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Formato 1: " + formato1.format(data));

        // Formato 18/05/09
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Formato 2: " + formato2.format(data));

        // Formato 18 de Maio de 2009
        // Usa o Locale para que o nome do mês seja em português
        SimpleDateFormat formato3 = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        System.out.println("Formato 3: " + formato3.format(data));

        // Formato Segunda-feira, 18 de Maio de 2009
        SimpleDateFormat formato4 = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        System.out.println("Formato 4: " + formato4.format(data));
    }
}
