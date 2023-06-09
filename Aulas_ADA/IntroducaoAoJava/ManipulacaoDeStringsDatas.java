package IntroducaoAoJava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class ManipulacaoDeStringsDatas {
    public static void main(String[] args) {
        System.out.println("___________________________");
        String nome = "Matheus";
        String saudacao = "a";

        

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","br");
        /*System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));*/
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >=0 &&agora.getHour ()< 12){
            saudacao = "bom dia";
        }
        else if(agora.getHour() >=12 &&agora.getHour ()< 18){
            saudacao = "boa tarde";
        }
        else if(agora.getHour() >=18 &&agora.getHour ()< 0){
            saudacao = "boa noite";
        }

        System.out.printf("Olá, %s. %nHoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());

        System.out.println("___________________________");

    }
    
}
