public class Coercao {
    public static void f(double x) {
        System.out.println(x);
    }  
    public static void main(String args[]) {
        f(3.1416);
        f((byte)1);
        f((short)2);
        System.out.println("---------------Transformando A para numero----------");
        f('a');
        f('A');
        f('À');
        f('Á');
        f('á');
        f('à');
        System.out.println("----------parada----------");
        f(3);
        f(4L);
        f(5.6F);
    }
}
