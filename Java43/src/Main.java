
public class Main {

	public static void main(String[] args) {
		try {
			if((args[0].equals("Federico"))&&(args[1].equals("Garc�aLorca"))) {
				Lorca lorca = new Lorca();
				lorca.poema();
			}
		} catch (Exception e) {
			NotAutorized notAutorized = new NotAutorized();
			notAutorized.noEsperados();
		}
	}

}
