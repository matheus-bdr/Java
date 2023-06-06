package IntroducaoAoJava;

public class ManipulandoNomes {
    public static void main(String[] args) {
        
        System.out.println("___________________________");
            String nome = "Matheus";
            System.out.println(nome);
            System.out.println(nome.toUpperCase());
            System.out.println(nome.toLowerCase());
            System.out.println(nome.length());
    
            String outroNome = "Lara";
    
            String saudacao = "a";
            System.out.println(nome.equalsIgnoreCase(outroNome));
    
            System.out.println("___________________________");
    }
}
