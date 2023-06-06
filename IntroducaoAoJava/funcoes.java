package IntroducaoAoJava;

public class funcoes {
    public static void main(String[] args) {
        String nome = "bedonio";
        saudacao(nome);
        int result = soma(2,3);
        System.out.println("O resultado da soma dos numeros é: " + result);
    }
    
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, "+ nomeParametro);
    }
    public static int soma(int a, int b ) {      
        return a + b; 
    }


}
