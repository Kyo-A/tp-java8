package tp11;

public class Dummy {

	private int valeur = 1;
	
	public static void main(String[] args){
		Dummy d = new Dummy();
		d.maMethode1();
		d.maMethode2();
	}

	public void maMethode1() {
		IMethodReference iM = new IMethodReference() {		
		int valeur = 2;
			@Override
			public void affiche() {
				System.out.println(this.valeur);			
			}
		};
		iM.affiche();
	}
	
	public void maMethode2() {
		int valeur = 2;
		IMethodReference iM = () -> {
			System.out.println(this);
		};
		iM.affiche();
	}

	@Override
	public String toString() {
		return "Dummy [valeur=" + valeur + "]";
	}	
}
