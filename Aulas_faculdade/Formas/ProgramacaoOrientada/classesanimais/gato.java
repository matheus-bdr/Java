package classesanimais;

public class gato extends animais{
    static int numeroDeGatos;
    
    @Override
    public String toString() {  
        return "ClasseGatos{" + "nome='" + nome + "}";
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        gato.numeroDeGatos = numeroDeGatos;
    }
    
    @Override
    public void soar() {
        System.out.println("miau");
    }
    public gato(String nome,String cor,double peso, int altura) {
        super(nome, cor, altura, peso, cor);
    }
}
