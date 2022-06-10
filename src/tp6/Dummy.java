package tp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//
//				System.out.println("I am runnable thread");
//
//			}
//
//		};
//
//		Thread t = new Thread(r);
//
//		t.start();
//
//		// Lambda Runnable
//		Runnable r2 = () -> {
//			System.out.println("I am runnable thread lambda expression");
//		};
//
//		// start the thread
//		new Thread(r2).start();

		List<Machine> machines = Arrays.asList(

				new Machine(1998, "hhhhh"), new Machine(1987, "hhhhh"), new Machine(2017, "hhhhh")

		);
		
		Comparator<Machine> comp = new Comparator<Machine>() {
			@Override
			public int compare(Machine m1, Machine m2) {
				return m1.getYear()-m2.getYear();
			}
		};
		
		Collections.sort(machines, comp);
		
		machines.forEach(System.out::println);

		Collections.sort(machines, new Sortbyyear());
//		
//		machines.forEach(System.out::println);

//		for (Machine machine : machines) {
//			System.out.println(machine);
//		}
//
//		machines.forEach(System.out::println);
//
//		machines.sort((Machine m1, Machine m2) -> m1.getYear() - m2.getYear());
//
//		machines.forEach((machine) -> System.out.println(machine));

//    	List<Machine> machiness = new ArrayList<Machine>();
//    	
//    	machiness.add(new Machine(1, "PC"));
//    	machiness.add(new Machine(1, "Portable"));
//    	machiness.add(new Machine(1, "Tel"));
//    	
//    	List<List<Machine>> machinesss = Arrays.asList(machiness);
//    	
//    	machinesss.forEach(System.out::println);

	}

}
