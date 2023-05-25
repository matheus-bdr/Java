package classesanimais;

public class passaro extends animais{
    static int numeroDePassaros;   
  

    @Override
    public String toString() {
        return "passaro [nome=" + nome + "]";
    }

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    public static void setNumeroDePassaros(int numeroDePassaros) {
        passaro.numeroDePassaros = numeroDePassaros;
    }  
    @Override
    public void soar() {
        System.out.println("piupiu");
    }
    public passaro(String nome,String cor,double peso, int altura, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);
    }
}
