package tp5;

@FunctionalInterface
public interface IMachineALaver {
	
	String demarrer(String type);

	default String accelerer(String type) {
		return null;
	}
	
}
