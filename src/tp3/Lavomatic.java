package tp3;

public class Lavomatic {

	public static void main(String[] args) {

		IMachineALaver iMachineALaver;
		iMachineALaver = (String type) -> {
			return "départ " + type;
		};
		
		System.out.println(iMachineALaver.demarrer("Elle demarre"));
	}

}
