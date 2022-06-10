package tp8;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {

		char[] chars = new char[3];

		chars[0] = 's';
		chars[1] = 'o';
		chars[2] = 'l';

		String c;

		ConstructInterface cI = (chars1) -> {
			return new String(chars1);
		};
		
		c = cI.getOne(chars);
		System.out.print(c);
		
//		ConstructInterface cI = String::new;
//		
//		System.out.print(cI.getOne(chars));
	}

}
