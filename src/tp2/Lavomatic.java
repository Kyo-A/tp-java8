package tp2;

public class Lavomatic {

	public static void main(String[] args) {

		IMachineALaver iMachineALaver;
		iMachineALaver = (String type) -> {
			System.out.print(type);
		};
		iMachineALaver.demarrer("Elle demarre");
	}
}
