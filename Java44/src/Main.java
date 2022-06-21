
public class Main {

	public static void main(String[] args) {
		Developer[] devs = {new Developer("Juan", "Marquez", 25, "34156434A", Profesiones.BACK_END_DEVELOPER),
				new Developer("María", "Marquez", 26, "39753528V", Profesiones.FRONT_END_DEVELOPER),
				new Developer("Marta", "Marquez", 26, "27455937L", Profesiones.FULL_STACK_DEVELOPER)};
		
		for (Developer dev : devs) {
			if(dev.getRolTecnologico().equals(Profesiones.BACK_END_DEVELOPER)||dev.getRolTecnologico().equals(Profesiones.FULL_STACK_DEVELOPER)) {
				System.out.println(dev.getNombre() + " Viva el Back");
			}
			if(!dev.getRolTecnologico().equals(Profesiones.BACK_END_DEVELOPER)) {
				System.out.println(dev.getNombre() + " JS es una 💩 es mejor utilizar TypeScript");
			}
		}
		
	}

}
