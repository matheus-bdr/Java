public class Objeto {
    public static void main(String[] args) {
        
        ClasseCachorro cachorrinho = new ClasseCachorro("dog", "amarelo", 0, 0, "nada");
        ClasseGatos gatinho = new ClasseGatos("bedaine", "amarelo", 0, 0);
        ClassePassaro passarinho = new ClassePassaro("bedas", "amarelo", 0, 0, null);
        
        cachorrinho.soar();
        gatinho.soar();
        passarinho.soar();
     
        

    }
    
}
