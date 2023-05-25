public class ClassePassaro extends ClasseAnimal{
    static int numeroDePassaros;   
  

    @Override
    public String toString() {
        return "ClassePassaro [nome=" + nome + "]";
    }

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    public static void setNumeroDePassaros(int numeroDePassaros) {
        ClassePassaro.numeroDePassaros = numeroDePassaros;
    }  
    @Override
    public void soar() {
        System.out.println("piupiu");
    }
    public ClassePassaro(String nome,String cor,double peso, int altura, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);
    }
}
