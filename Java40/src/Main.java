import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un int: ");
		int i = sc.nextInt();
		System.out.println("Ha introducido: " + i);
		System.out.print("Introduce un long: ");
		long l = sc.nextLong();
		System.out.println("Ha introducido: " + l);
		System.out.print("Introduce un short: ");
		short s = sc.nextShort();
		System.out.println("Ha introducido: " + s);
		System.out.print("Introduce un double: ");
		double d = sc.nextDouble();
		System.out.println("Ha introducido: " + d);
		System.out.print("Introduce un byte: ");
		byte b = sc.nextByte();
		System.out.println("Ha introducido: " + b);
		System.out.print("Introduce un boolean: ");
		boolean t_f = sc.nextBoolean(); sc.nextLine(); 
		/* Se usa nextLine() porque introducimos el booleano seguido de un 
		 * salto de línea, que es capturado por el siguiente nextLine(). 
		 * Con ello ya podemos usar el próximo nextLine() correctamente*/
		System.out.println("Ha introducido: " + t_f);
		System.out.print("Introduce un String: "); 
		String S = sc.nextLine();
		System.out.println("Ha introducido: " + S);
	}

}
