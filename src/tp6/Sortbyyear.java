package tp6;

import java.util.Comparator;

public class Sortbyyear implements Comparator<Machine>
{ 
	public int compare(Machine m1, Machine m2) {
		
		return m1.getYear()-m2.getYear(); 
	}

}	
