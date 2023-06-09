import java.lang.reflect.Method;

public class Square {
    static int Square (int a){
        System.out.println("Square of int:" + a);
        return(a*a);
    }
    static double Square (double a){
        System.out.println("Square of double:" + a);
        return(a*a);
    }
    static float Square (float a){
        System.out.println("Square of float"+a);
        return(a*a);
    }
    public static void main(String[] args) {
        Square(4);
        Square(4.0);
        Square(2.8);
        Square(2.0f);

    }
}
