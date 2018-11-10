
/**
 * Suggestion: Initializing and mutating an ArrayList
 * 
 * @author Nikhil Kumar
 */

import java.util.ArrayList;

public class ArrayListExample {

	public static final int NUMBER_OF_FILMS = 10;

	/**
	* IMPORTANT:
	*
	* For all these examples, you can assume that both filmNames 
	* and filmYears have same number of elements. Assume that the 
    * array elements are in one-to-one correspondence with their index.
	* 
	* ex)
	* 
	* "Film A" was made in 2009, where filmNames.get(i) == "Film A", 
	*  and filmYears.get(i) == 2009
	*
	* You can also assume the lists will be non-null.
	*/


	/**
	 * FOR DEMO PURPOSES
	 * Prints all films and the corresponding years in which they were made.
	 * 
	 * @param filmNames, a list of films
	 * @param filmYears, a list of years
	 * 
	 * @return
	 */
	public static void printArrayList(ArrayList<String> filmNames) {
		for (int i = 0; i < filmNames.size(); ++i) {
			System.out.println(filmNames.get(i));
		}
	}

	public static void printFilms(ArrayList<String> filmNames, ArrayList<Integer> filmYears) {
		System.out.println("--------------------------------");
		System.out.println("FILM DATABASE");
		System.out.println("--------------------------------");
		for (int i = 0; i < filmNames.size(); ++i) {
			System.out.println(filmNames.get(i) + " - " + filmYears.get(i));
		}
		System.out.println("--------------------------------");
	}

	/**
	 * Remove all films in our records that were made before a given year.
	 * 
	 * @param filmNames, a list of all films
	 * @param filmYears, a list of all film years
	 * @param year, the year with which we want to filter films
	 * 
	 * @return
	 */
	public static void removeFilmsBeforeYear(ArrayList<String> filmNames,
											 ArrayList<Integer> filmDates, int year) {

		int index = 0;
		while (index < filmNames.size()) {
			if (filmDates.get(index) < year) {
				filmNames.remove(index);
				filmDates.remove(index);
			} else {
				index += 1;
			}
		}
	}

	/**
	 * Removing all elements from ArrayList 
	 * (without using ArrayList.clear(), or re-assigning reference).
	 */
	public static void destroyFilmList1(ArrayList<String> filmNames) {
		filmNames = null;
	}

	public static void destroyFilmList2(ArrayList<String> filmNames) {
		filmNames = new ArrayList<String>();
	}

	public static void destroyFilmList3(ArrayList<String> filmNames) {
		for (int i = 0; i < filmNames.size(); ++i) {
			filmNames.remove(i);
		}
	}

	public static void destroyFilmList4(ArrayList<String> filmNames) {
		for (int i = 0; i < filmNames.size(); ++i) {
			filmNames.remove(filmNames.get(filmNames.size() - 1));
		}
	}

	public static void destroyFilmList5(ArrayList<String> filmNames) {
		for (int i = filmNames.size() - 1; i > 0; --i) {
			filmNames.remove(i);
		}
	}

	public static void destroyFilmList6(ArrayList<String> filmNames) {
		
		int i = 1;
		while (i < filmNames.size()) {
			filmNames.remove(filmNames.size() - i);
			++i;
		}
	}

	public static ArrayList<String> generateFilmNamesList() {

		ArrayList<String> starWarsFilmNames = new ArrayList<String>();

		starWarsFilmNames.add("The Phantom Menace");
		starWarsFilmNames.add("Attack of the Clones");
		starWarsFilmNames.add("Revenge of the Sith");
		starWarsFilmNames.add("A New Hope");
		starWarsFilmNames.add("The Empire Strikes Back");
		starWarsFilmNames.add("Return of the Jedi");
		starWarsFilmNames.add("The Force Awakens");
		starWarsFilmNames.add("The Last Jedi");
		starWarsFilmNames.add("Rogue One: A Star Wars Story");
		starWarsFilmNames.add("Solo: A Star Wars Story");

		return starWarsFilmNames;
	}

	public static ArrayList<Integer> generateFilmYearsList() {

		ArrayList<Integer> starWarsFilmYears = new ArrayList<Integer>();

		starWarsFilmYears.add(1999);
		starWarsFilmYears.add(2002);
		starWarsFilmYears.add(2005);
		starWarsFilmYears.add(1977);
		starWarsFilmYears.add(1980);
		starWarsFilmYears.add(1983);
		starWarsFilmYears.add(2015);
		starWarsFilmYears.add(2017);
		starWarsFilmYears.add(2016);
		starWarsFilmYears.add(2018);

		return starWarsFilmYears;
	}

	public static void main(String[] args) {

		/**
		 * Removing from an ArrayList.
		 * Small examples.
		 * Which are correct?
		 */
		{
			System.out.println("\n\n --- destroyFilmList1() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList1(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}

		{
			System.out.println("\n\n --- destroyFilmList2() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList2(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}

		{
			System.out.println("\n\n --- destroyFilmList3() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList3(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}

		
		{
			System.out.println("\n\n --- destroyFilmList4() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList4(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}

		{
			System.out.println("\n\n --- destroyFilmList5() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList5(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}

		{
			System.out.println("\n\n --- destroyFilmList6() --- \n\n");
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			System.out.println("+++ Before Deletion +++\n");
			printArrayList(starWarsFilmNames);
			destroyFilmList6(starWarsFilmNames);
			System.out.println("\n+++ After Deletion +++\n");
			printArrayList(starWarsFilmNames);
		}
		

		/**
		 * Removing from an ArrayList.
		 * Advanced example.
		 * Can you write this method?
		 */
		{
			ArrayList<String> starWarsFilmNames = generateFilmNamesList();
			ArrayList<Integer> starWarsFilmYears = generateFilmYearsList();

			printFilms(starWarsFilmNames, starWarsFilmYears);
			removeFilmsBeforeYear(starWarsFilmNames, starWarsFilmYears, 2007);
			printFilms(starWarsFilmNames, starWarsFilmYears);
		}
	}
}
