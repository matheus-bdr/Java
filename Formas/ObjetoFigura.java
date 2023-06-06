class Figura{
     double Area;
     double Perimetro;
    private void CalcularArea(){};
    private void CalcularPerimeto(){};
    public double getArea(){
        return this.Area;
    }
    public double getPerimetro(){
        return this.Perimetro;
    }
}
class Retangulo extends Figura{
    double Base, Altura;
    public Retangulo(double base, double altura) {
        Base = base;
        Altura = altura;
    }
    private void CalcularArea(){
        this.Area = this.Base * this.altura;
    };
    private void CalcularPerimeto(){
        this.Perimetro = (this.Base)*2 + (this.altura)*2;
    };
}
class Circulo extends Figura{
    double Raio;

    public Circulo(double raio) {
        Raio = raio;
    }
    private void CalcularArea(){
        this.Area =  (Raio*Raio)*3.1416;
    };
    private void CalcularPerimeto(){
        this.Area =  2*(3.1416*3.1416);
    };
    
}

public class ObjetoFigura{
    public static void main(String[] args) {
        Retangulo R = new Retangulo(2, 3);
        Circulo C = new Circulo(2);
        System.out.println(R.getArea());
        System.out.println(R.getPerimetro());
        System.out.println(C.getArea());
        System.out.println(C.getPerimetro());
    }
}