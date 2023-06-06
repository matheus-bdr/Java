package IntroducaoAoJava;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
       String[] letras= new String[5];
       // [0] [1] [2] [3] [4] sempre o numero -1 (5-1)
       //String[] letras= {"a","b".........};
       letras[0] = "A";
       letras[1] = "B";
       letras[2] = "C";
       letras[3] = "D";
       letras[4] = "E";
       for(int i=0 ; i<letras.length ; i++){
            System.out.println(letras[i]);
       } 
       System.out.println("_________________________________");
       System.out.println(Arrays.toString(letras));
    }
}
