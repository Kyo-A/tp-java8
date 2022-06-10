package tp10;


import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;


public class App {
	
	public static void main(String[] args) {
		Collection<Gagnants> gagnantsTDF = Arrays.asList(
				new Gagnants(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657,
						Duration.parse("PT89H40M27S"), 8),
				new Gagnants(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570,
						Duration.parse("PT91H00M26S"), 4),
				new Gagnants(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
				new Gagnants(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
				new Gagnants(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"),
						12),
				new Gagnants(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"),
						2),
				new Gagnants(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"),
						14),
				new Gagnants(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"),
						14),
				new Gagnants(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
				new Gagnants(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"),
						16),
				new Gagnants(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"),
						14));

		System.out.println("------------------------Exo01----------------------------");

		gagnantsTDF.stream().filter(g -> g.getKm() <= 3500).map(Gagnants::getName).forEach(System.out::println);

		System.out.println("------------------------Exo02----------------------------");

		gagnantsTDF.stream().filter(g -> g.getKm() >= 3500).map(x -> x.getName()).forEach(System.out::println);

		System.out.println("------------------------Exo03----------------------------");

		gagnantsTDF.stream().filter(g -> g.getKm() <= 3500).limit(2).map(x -> x.getName()).forEach(System.out::println);

		System.out.println("------------------------Exo04----------------------------");

		gagnantsTDF.stream().map(x -> x.getName()).distinct().forEach(System.out::println);

		System.out.println("------------------------Exo05----------------------------");

		long count = gagnantsTDF.stream().map(s -> s.getName()).distinct().count();

		System.out.println(count);

		// System.out.println(gagnantsTDF.stream().map(s -> s.getName()).distinct().count());

		System.out.println("------------------------Exo06----------------------------");

		gagnantsTDF.stream().map(x -> x.getName()).skip(2).forEach(System.out::println);

		System.out.println("------------------------Exo07----------------------------");

		gagnantsTDF.stream().map(s -> s.getYear() + s.getName()).forEach(System.out::println);
		
		System.out.println("------------------------Exo08----------------------------");

		Optional<Gagnants> any = gagnantsTDF.stream().filter(g -> g.getName().contains("Wiggins")).findAny();
		
		System.out.println(any);

		System.out.println("------------------------Exo9----------------------------");

//		Optional<Integer> one = gagnantsTDF.stream().map(s -> s.getYear()).filter(g -> g.equals(2014)).findFirst();
		
		Optional<Integer> one = gagnantsTDF.stream().map(Gagnants::getYear)
								.filter(g -> g.equals(2014)).findFirst();

		if (one.isPresent()) {
			Integer result = one.get();
			System.out.println(result);
		}

		System.out.println("------------------------Exo10----------------------------");

		Integer r1 = gagnantsTDF.stream().map(s -> s.getKm()).reduce(0, Integer::sum);
		
		System.out.println(r1);
		
		System.out.println("------------------------Exo11----------------------------");

		Optional<Integer> r2 = gagnantsTDF.stream().map(s -> s.getKm()).reduce(Integer::min);

		System.out.println(r2);

		System.out.println("------------------------Exo12----------------------------");

		Optional<Integer> r3 = gagnantsTDF.stream().map(s -> s.getKm()).reduce(Integer::max);

		System.out.println(r3);
		
		System.out.println("------------------------Exo13----------------------------");

		Optional<Gagnants> g = gagnantsTDF.stream()
				.max(Comparator.comparingDouble(Gagnants::getVitesseMoyenne));
		
		System.out.println(g);
		
		System.out.println("------------------------Exo14----------------------------");

		OptionalDouble g2 = gagnantsTDF.stream().mapToDouble(Gagnants::getVitesseMoyenne).max();
		
		System.out.println(g2);
		
		System.out.println("------------------------Exo15----------------------------");
		
		Map<String,List<String>> gagnants = gagnantsTDF.stream()
				.collect(Collectors.groupingBy(Gagnants::getName, Collectors.mapping(Gagnants::getName, Collectors.toList())));
		
//		Map<Object, Long> gagnants = gagnantsTDF.stream()
//				.collect(Collectors.groupingBy(s-> s.getName()+'-'+ s.getNat(), Collectors.counting()));
		
		System.out.println(gagnants);
		
	}

}
