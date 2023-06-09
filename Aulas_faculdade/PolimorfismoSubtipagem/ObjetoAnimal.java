public class Animal {
    void fazerBarulho(){
        System.out.println("animal faz barulho");
    }
}

class Cachorro extends Animal{
    @Override
    void fazerBarulho(){
        System.out.println("cachorro late");
    }
}
class Gato extends Animal{
    @Override
    void fazerBarulho(){
        System.out.println("gato mia");
    }
}
public class ObjetoAnimal {
    Animal A = new Cachorro();
    Gato B = new gato();
    Animal C = new Animal();
    
}