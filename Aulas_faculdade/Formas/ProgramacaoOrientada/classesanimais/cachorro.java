package classesanimais;

public class cachorro extends animais{
    //atributos    
   
    private int tamanhoDoRabo;

    static int numeroDeCachorros;
   
    public cachorro() {
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        cachorro.numeroDeCachorros = numeroDeCachorros;
    }
//----------------------------------------- fim dos getters e setters ---------------------------------------

    public String pegar(){
        return "Bolinha";
    }
    

    public String interagir(String acao){
       switch(acao){
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "Vai dormir!": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro";break;
       }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {  
        return "ClasseCachorro{" + "nome='" + nome + "}";
    }
    @Override
    public void soar() {
        System.out.println("au au");
    }
    public cachorro(String nome,String cor,double peso, int altura, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }
}    