class Animal {
    private Strings Nome;
    private String Raca;

    public Animal() {
        System.out.println("não faz nada");
    }

    public Animal(String Nome) {
        this.Nome = Nome;
    }

    public String caminha() {
        System.out.println("caminha");
    }
}