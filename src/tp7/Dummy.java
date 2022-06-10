package tp7;

import java.util.Arrays;
import java.util.List;



public class Dummy {
	
	public static void main(String[] args) throws InterruptedException
    {
		List<Integer> entiers = Arrays.asList(new Integer(76),new Integer(43),new Integer(12));
		
		entiers.forEach(entier->System.out.println(entier));
		
		entiers.forEach(System.out::println);
		
		IMethodReference Im = Dummy::maMethode;
					
		Im.affiche();
		
		IMethodReference Im2 = new Dummy()::maMethode2;
		
		Im2.affiche();
		
    }
	
	public static void maMethode()
	{
		System.out.println("youhou");
	}
	
	public void maMethode2()
	{
		System.out.println("youhou WITHOUT STATIC DECLARED On The method");
	}



}
