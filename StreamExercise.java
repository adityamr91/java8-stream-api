package test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

	public static class Country {
		String name;
		String capital;
		String continent;

		long population;

		Country(String name, String capital, String continent, long population) {
			this.name = name;
			this.capital = capital;
			this.continent = continent;
			this.population = population;
		}

		static List<Country> getCountries() {
			return List.of(new Country("USA", "Washington", "North America", 7512000),
					new Country("Brazil", "Brasilia", "South America", 4804000),
					new Country("Italy", "Rome", "Europe", 2873000), new Country("China", "Beijing", "Asia", 21540000),
					new Country("France", "Paris", "Europe", 2161000),
					new Country("Spain", "Madrid", "Europe", 3223000));
		}
	}

	public static void main(String[] args) {
		List<Country> countryList = Country.getCountries();
		
		// Print the number of American countries
		List<Country> americanCountries = countryList.stream().filter(s -> s.continent.matches("(.*)America(.*)")).collect(Collectors.toList());
		System.out.println("American countries: ");
		for (Country amr : americanCountries) {
			System.out.println(amr.name);
		}

		System.out.println(" ");
		
		// Print the European capitals in order of population (from the most to the less populated). The requested output for this example is: Madrid,Rome,Paris
		List<Country> euCaptialsPopDesc = countryList.stream().filter(s -> s.continent.matches("(.*)Europe(.*)"))
				.sorted(Comparator.comparing(obj -> obj.population, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		
		System.out.println("European capitals in order of population: ");
		for (Country eu : euCaptialsPopDesc) {
			System.out.println(eu.capital);
		}
		
		System.out.println(" ");
		
		System.out.println("European capitals in order of population USING FOR EACH: ");
		countryList.stream().filter(s -> s.continent.matches("(.*)Europe(.*)"))
		.sorted(Comparator.comparing(obj -> obj.population, Comparator.reverseOrder()))
		.forEach(e -> System.out.println(e.capital.toString()));
		
		System.out.println(" ");
		
		List<String> countries = countryList.stream().map(x->x.name).collect(Collectors.toList());
		System.out.println("All Countries Name : " + countries);
	}
}


//Output:
//	
//	
//	American countries: 
//		USA
//		Brazil
//		 
//	European capitals in order of population: 
//		Madrid
//		Rome
//		Paris

