import Lojas.Petshop;
import classesanimais.cachorro;
import classesanimais.gato;
import classesanimais.passaro;

public class Objeto {
    public static void main(String[] args) {
        
        cachorro cachorrinho = new cachorro("dog", "amarelo", 0, 0, "nada");
        gato gatinho = new gato("bedaine", "amarelo", 0, 0);
        passaro passarinho = new passaro("bedas", "amarelo", 0, 0, null);
        Petshop petshop = new Petshop();
        petshop.darBanho(passarinho);
        passarinho.soar();
        
        System.out.println(passarinho.getEstadoDeEspirito());

        petshop.deixarNoHotel(gatinho);
        gatinho.soar();

        System.out.println(gatinho.getEstadoDeEspirito());

        petshop.tosar(cachorrinho);
        cachorrinho.soar();
        
        System.out.println(cachorrinho.getEstadoDeEspirito());
        

    }
    
}
