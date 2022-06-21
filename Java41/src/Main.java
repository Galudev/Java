import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		nombreCompleto();
		
		jugar();
	}
	
	public static void nombreCompleto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los siguientes datos:");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Primer apellido: ");
		String apellido1 = sc.nextLine();
		System.out.print("Segundo apellido: ");
		String apellido2 = sc.nextLine();
		System.out.println("¡Hola " + nombre + " " + apellido1 + " " + apellido2 + "!");
	}

	public static void jugar() {
		char[][] tab = {{' ','1','2','3'},{'1',' ',' ',' '},{'2',' ',' ',' '},{'3',' ',' ',' '}};
		boolean fin = false;
		char player = 'X';
		int jugadas = 0;

		printTab(tab);
		
		while(!fin) {
			tab = set(tab, player);
			printTab(tab);
			fin = win(tab, player);
			player = changePlayer(player);
			jugadas++;
			if(jugadas>=9 && !fin) {
				System.out.println("Ningún jugador ha ganado");
				break;
			}
		}
	}
	
	public static char[][] set(char[][] tab, char player) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Jugador " + player + ". Ingresa coordenadas (x,y) para colocar la pieza");
		do {
			do {
				System.out.print("Ingresa X: ");
				x = sc.nextInt();
			} while ((x<1)||(x>3));
			do {
				System.out.print("Ingresa Y: ");
				y = sc.nextInt();
			} while ((y<1)||(y>3));
		} while(tab[y][x]!=' ');
		tab[y][x] = player;
		return tab;
	}
	
	public static void printTab(char[][] tab) {
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print("|");
			for(int j=0;j<4;j++) {
				System.out.print(tab[i][j] + "|");
			}
			System.out.println();
		 }
		System.out.println();
	}
	
	public static boolean win(char[][] tab, char player) {
		for(int i=1;i<4;i++) {
			if(((tab[i][1]!=' ')&&(tab[i][1]==tab[i][2])&&(tab[i][1]==tab[i][3]))||((tab[1][i]!=' ')&&(tab[1][i]==tab[2][i])&&(tab[1][i]==tab[3][i]))) {
				System.out.println("¡Ha ganado el jugador " + player + "!");
				return true;
			}
		}
		if(((tab[1][1]!=' ')&&(tab[1][1]==tab[2][2])&&(tab[1][1]==tab[3][3]))||((tab[3][1]!=' ')&&(tab[3][1]==tab[2][2])&&(tab[3][1]==tab[1][3]))) {
			System.out.println("¡Ha ganado el jugador " + player + "!");
			return true;
		}
		return false;
	}
	
	public static char changePlayer(char player) {
		switch (player) {
		case 'X':
			player = 'O';
			break;
		case 'O':
			player = 'X';
			break;
		default:
			break;
		}
		return player;
	}
}
