import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.management.ConstructorParameters;

public class ClasseGatos extends ClasseAnimal{
    static int numeroDeGatos;
    
    @Override
    public String toString() {  
        return "ClasseGatos{" + "nome='" + nome + "}";
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        ClasseGatos.numeroDeGatos = numeroDeGatos;
    }
    
    @Override
    public void soar() {
        System.out.println("miau");
    }
    public ClasseGatos(String nome,String cor,double peso, int altura) {
        super(nome, cor, altura, peso, cor);
    }
}
