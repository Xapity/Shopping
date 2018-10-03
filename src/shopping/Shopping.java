/*
October 3, 2018 
Callum MacLeod
U1 A2
 */

package shopping;
import java.util.Scanner;//importing packages
import java.text.DecimalFormat;

public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);//setting up scanner
        
        int num1, num2, num3;//declaring variables
        double ans1, ans2, ans3, fin;
        DecimalFormat x;//setting up deciaml format
        x = new DecimalFormat ("######.##");
        final double KEY, USB, MOUSE, TAX;
        TAX = 1.13;
        KEY = 49.99;
        MOUSE = 25.99;
        USB = 19.99;
        
        
        System.out.println("How many USB storage device(s) have been bought?");//intro line
        num1=keyedInput.nextInt();//scanning written line
        ans1 = num1*USB;//getting cost of all USB devices
        System.out.println("How many keyboard(s) have been bought?");//" with keyboard(s)
        num2=keyedInput.nextInt();
        ans2 = num2*KEY;
        System.out.println("How many computer mouse(s) have been bought?");//" with mouse(s)
        num3=keyedInput.nextInt();
        ans3 = num3*MOUSE;
        fin = ans3+ans2+ans1;//taking all answers to get subtotal
        System.out.println("Subtotal = " + x.format(fin)+"$");//printing subtotal
        System.out.println("Total with HST = "+x.format(fin*TAX)+"$");//total with HST
        

        
    }
    
}
