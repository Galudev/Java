import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ejercicio 1
		Ejercicio1(sc);
		
		// Ejercicio 2
		int[] arr = {1,2};
		try {
			array(arr,3);
		} catch(Exception e) {
			System.err.println(e);
		}
		
		try {
			division(3,0);
		} catch(Exception e) {
			System.err.println(e);
		}
		
		// Ejercicio 3
		sc.useLocale(Locale.US);
		System.out.print("Introduce un double: ");
		try {
			double d = sc.nextDouble();
			System.out.println("Ha introducido: " + d);
		} catch(InputMismatchException e) {
			sc.useLocale(Locale.FRENCH);
			double d = sc.nextDouble();
			System.out.println("Ha introducido: " + d);
		} catch(Exception e) {
			System.err.println(e);
		}
		
		sc.close();
		
	}
	
	public static void Ejercicio1(Scanner sc) {
		System.out.print("Introduce un int: ");
		try{
			int i = sc.nextInt();
			System.out.println("Ha introducido: " + i);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un long: ");
		try {
			long l = sc.nextLong();
			System.out.println("Ha introducido: " + l);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un short: ");
		try {
			short s = sc.nextShort();
			System.out.println("Ha introducido: " + s);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un double: ");
		try {
			double d = sc.nextDouble();
			System.out.println("Ha introducido: " + d);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un byte: ");
		try {
			byte b = sc.nextByte();
			System.out.println("Ha introducido: " + b);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un boolean: ");
		try {
			boolean t_f = sc.nextBoolean(); sc.nextLine();
			System.out.println("Ha introducido: " + t_f);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
		
		System.out.print("Introduce un String: "); 
		try{
			String S = sc.nextLine();
			System.out.println("Ha introducido: " + S);
		} catch(Exception e) {
			System.err.println(e);
			sc.nextLine();
		}
	}
	
	public static int array(int[] arr, int i) throws Exception {
		return arr[i];
	}
	
	public static int division(int num1, int num2) throws Exception {
		return num1/num2;
	}

}
