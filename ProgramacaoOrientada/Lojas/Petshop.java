package Lojas;

import classesanimais.animais;
import classesanimais.cachorro;

public class Petshop {
    public void darBanho(animais animal) {
        animal.setEstadoDeEspirito("limpo");
    }
    public void tosar(cachorro cachorro) {
        cachorro.setEstadoDeEspirito("tosado");
    }
    public void deixarNoHotel(animais animal) {
        animal.setEstadoDeEspirito("triste");
    }

}
