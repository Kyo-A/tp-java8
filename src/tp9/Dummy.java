package tp9;

import java.util.Arrays;
import java.util.Collection;

import tp8.ConstructInterface;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {

		Collection<Integer> list = Arrays.asList(2, 3, 9, 4);
		
		final Integer i = 8;
		
		list.forEach((e) -> {
			//i = 4 + 5;
			System.out.println(e);
		});
		
		list.forEach(System.out::println);
	}

}
