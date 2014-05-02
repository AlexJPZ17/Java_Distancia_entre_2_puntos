package calcula.la.distancia.entre.dos.puntos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculaLaDistanciaEntreDosPuntos {

    public static void main(String[] args) {
       double x1,x2,y1,y2,distancia; //Declaración de la variables
Scanner entrada = new Scanner(System.in);
  
 System.out.println("\nPor favor introduzca la coordenada x1 del primer punto: ");
 x1 = entrada.nextDouble();
 
 System.out.println("\nPor favor introduzca la coordenada x2 del segundo punto: ");
 x2 = entrada.nextDouble();
   
 System.out.println("\nPor favor introduzca la coordenada y1 del primer punto: ");
 y1 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada y2 del segundo punto: ");
 y2 = entrada.nextDouble();
 
 //d = Math.hypot(x2-x1, y2-y1);
 distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
 //distancia = Math.sqrt( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) );

 System.out.printf("\nLa distancia entre los puntos es: %.2f\n", distancia);
 
 
 
//Lectura de datos


/*x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el punto X1 :"));


y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el punto X2 :"));


x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese l punto Y1:"));


y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el punto Y2:"));


//procesamiento


d = Math.hypot(x2-x1, y2-y1);


//Muestra de los resultados


JOptionPane.showMessageDialog(null, "La distancia entre los puntos \nA("+x1+","+y1+") y B("+x2+","+y2+") es ="+d);

 */
}
}
