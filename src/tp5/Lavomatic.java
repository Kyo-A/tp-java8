package tp5;

public class Lavomatic {
	
	public static void main( String[] args )
    {
		
		IMachineALaver iMachineALaver;
		
		iMachineALaver = type -> "GOOOOO" + " " + type;
		
		System.out.println(iMachineALaver.demarrer("Elle demarre"));
    }

}
