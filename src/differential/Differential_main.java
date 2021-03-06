//Input value of  a> 1
//Input value of h> 0.00000001
//f(x)=x^2のx=1.0における微分係数は2.0
//f(x)=x^2のx=1.0における数値積分は1.999999987845058
//相対誤差=6.07747097092215E-7


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
	System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
	
	Differential_lib dlib1 = new Differential_lib(a,h);
	System.out.println("f(x)=x^2のx="+a+"における数値積分は"+dlib1.getDx());
	
	Differential_lib clib = new Differential_lib(a,h);
	System.out.println("相対誤差="+clib.getAns());
	}


}