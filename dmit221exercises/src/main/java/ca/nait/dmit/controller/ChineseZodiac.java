package ca.nait.dmit.controller;

import java.util.Calendar;

/**
 * In the Chinese calendar, every year is associated with a particular animal. 
 * The 12-year animal cycle is rat, ox, tiger, rabbit, dragon, snake, horse, 
 * goat (or ram), monkey, rooster, dog, and pig (or boar). The year 1900 is a 
 * year of the rat; thus 1901 is a year of the ox and 1912 is another year of 
 * the rat. If you know in what year person was born, you can compute the 
 * offset from 1900 and determine the animal associated with that person's 
 * year of birth.
 * @author Shoujian(Thomas) Chu
 * @version 2012.09.18
 */

public class ChineseZodiac {
	private int birthYear = Calendar.getInstance().get( Calendar.YEAR );
	private String animalYear;
	ChineseZodiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChineseZodiac(int birthYear) {
		super();
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * Calculate the ChineseZodiac using the birth year of the person.
	 * The ChineseZodiac of a person is calculated using the formula: (birthYear-1900)%12
	 * to get the offset, if the offset is 0, then the birth year is rat, as follows:
	 * --------------------------------------
	 * | Offset of 12 from 1900	| Animal	|
	 * |-------------------------------------
  	 * | 0 						| Rat		|
	 * | 1 						| Ox		|
	 * | 2 						| Tiger		|
	 * | 3 						| Rabbit	|
	 * | 4 						| Dragon	|
	 * | 5 						| Snake		|
	 * | 6 						| Horse		|
	 * | 7 						| Goat		|
	 * | 8 						| Monkey	|
	 * | 9 						| Rooster	|
	 * | 10 					| Dog		|
	 * | 11 					| Pig		|
	 * --------------------------------------
	 * @return one of following:  rat, ox, tiger, rabbit, dragon, snake, horse, 
 * goat, monkey, rooster, dog, pig.
	 */
	
	public String getAnimal(){		
		switch((birthYear-1900)%12){
		case(0): animalYear = "Rat";break;
		case(1): animalYear = "Ox";break;
		case(2): animalYear = "Tiger";break;
		case(3): animalYear = "Rabbit";break;
		case(4): animalYear = "Dragon";break;
		case(5): animalYear = "Snake";break;
		case(6): animalYear = "Horse";break;
		case(7): animalYear = "Goat";break;
		case(8): animalYear = "Monkey";break;
		case(9): animalYear = "Rooster";break;
		case(10): animalYear = "Dog";break;
		default: animalYear = "Pig";
		}		
		return animalYear;
	}


}
