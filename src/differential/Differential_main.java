//Input value of  a> 1
//Input value of h> 0.00000001
//f(x)=x^2��x=1.0�ɂ���������W����2.0
//f(x)=x^2��x=1.0�ɂ����鐔�l�ϕ���1.999999987845058
//���Ό덷=6.07747097092215E-7


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
	System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
	
	Differential_lib dlib1 = new Differential_lib(a,h);
	System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l�ϕ���"+dlib1.getDx());
	
	Differential_lib clib = new Differential_lib(a,h);
	System.out.println("���Ό덷="+clib.getAns());
	}


}