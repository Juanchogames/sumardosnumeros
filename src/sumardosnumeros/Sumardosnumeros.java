
package sumardosnumeros;
import java.util.Scanner;
public class Sumardosnumeros {
public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        float nn,nn4,p;
        System.out.print("ingresar el primer numero");
        nn=lectura.nextFloat();
        System.out.print("ingresa el segundo numero");
        nn4=lectura.nextFloat ();
        p=nn/nn4;
        System.out.print("la divison es" + p);
                
    }
    
}
