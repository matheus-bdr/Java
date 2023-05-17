/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package heranca.exemplo01;
import javax.swing.JFrame;
/**
 *
 * @author matheuscruz.santos
 */
/*Nesse caso exemplo01 herda o JFrame */
public class Exemplo01 extends JFrame{
   public Exemplo01(){
       this.setTitle("seja bem vindo");
       this.setSize(500,300);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
   }
   public static void main() {
    
    }
}
