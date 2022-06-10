package tp1;

public class Lavomatic {
	
	public static void main(String[] args) {

		IMachineALaver iMachineALaver;
		iMachineALaver = () -> {
			System.out.println("Elle demarre");
		};
		iMachineALaver.demarrer();

	}
}
