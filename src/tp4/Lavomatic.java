package tp4;

public class Lavomatic {

	public static void main(String[] args) {

		IMachineALaver iMachineALaver;
		
		iMachineALaver =  type ->  "d�part " + type;
		
		System.out.println(iMachineALaver.demarrer("Elle demarre"));
	}

}
