//Input value of  a> 1
//Input value of h> 0.00000001
//f(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é”÷•ªŒW”‚Í2.0
//f(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é”’lÏ•ª‚Í1.999999987845058
//‘Š‘ÎŒë·=6.07747097092215E-7


package differential;

import java.util.Scanner;


public class Differential_main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Input value of  a> ");
	double a = Double.parseDouble(scan.next());
	System.out.print("Input value of h> ");
	double h = Double.parseDouble(scan.next());
	
	Differential_lib dlib = new Differential_lib(a,h);
	System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
	
	Differential_lib dlib1 = new Differential_lib(a,h);
	System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’lÏ•ª‚Í"+dlib1.getDx());
	
	Differential_lib clib = new Differential_lib(a,h);
	System.out.println("‘Š‘ÎŒë·="+clib.getAns());
	}


}