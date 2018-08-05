import java.net.*;
import java.util.ArrayList;
import java.io.*;

/*
 * Query a champion to find out how old it is
 * Compare champions to see how much older one is
 * Query a champion to return the 3 champions released before
 * And the 3 champions released after
 */
public class Champion {

	private int order;
	private String champion;
	private StringBuilder championBuilder;
	private int counter; // ordinal of champ's release date
	private int year, month, day;

	public Champion(int order, String champion, int year, int month, int day) {
		// FINISH CONSTRUCTOR
	}


	public static String ordinal(int i) {
		String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
		switch (i % 100) {
		case 11:
		case 12:
		case 13:
			return i + "th";
		default:
			return i + sufixes[i % 10];

		}
	}

	public static void main(String[] args) throws Exception {

		ArrayList<Champion> champList = new ArrayList<>();
		
		
	}
}