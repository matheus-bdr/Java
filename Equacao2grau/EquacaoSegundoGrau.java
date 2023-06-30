public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] calcularRaizes() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[]{raiz1, raiz2};
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            return new double[]{raiz};
        } else {
            return new double[]{};
        }
    }

    public void exibirRaizes() {
        double[] raizes = calcularRaizes();
        int numRaizes = raizes.length;
        if (numRaizes == 2) {
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raizes[0]);
            System.out.println("Raiz 2: " + raizes[1]);
        } else if (numRaizes == 1) {
            System.out.println("A equação possui uma raiz real:");
            System.out.println("Raiz: " + raizes[0]);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(1, 1, 2);
        equacao.exibirRaizes();
    }
} 