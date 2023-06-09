public class Conflito {
    public static void soma(int a, int b) {
        System.out.println("A soma dos ints: " + (a+b));
    }
    public static void soma(double a, double b) {
        System.out.println("A soma dos doubles:" + (a+b));
    }

    public static void main(String[] args) {
        soma(1, 2);
        soma(1.1, 2.2);
        soma(1, 2.2);
        soma((int)1.1, (int)2.2);
    }
}
