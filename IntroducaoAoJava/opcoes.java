package IntroducaoAoJava;

public class opcoes {
    public static void main(String[] args) {
        int nota = 100;
        String media; 
        if(nota == 100){
            media = "a";
        } 
        else if(nota <= 80){
            media = "b";
        } 
        else if(nota <= 70){
            media = "c";
        } 
        else if(nota <= 60){
            media = "d";
        } else {
            media = null;
        }
        switch(media){
            case "a":
            System.out.println("media excelente");
            break;
            case "b":
            System.out.println("media boa");
            break;
            case "c":
            System.out.println("ta na media");
            break;
            case "d":
            System.out.println("Precisa melhorar");
            break;
        }
    }
    
}
