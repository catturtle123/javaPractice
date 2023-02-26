package tipAndTricks;

import java.util.Arrays;

public class EnumRunner {
	public static void main(String[] args) {
		Season season1 = Season.FALL;
		season1 = Season.valueOf("SPRING");
	
		System.out.println(season1);
		System.out.println(season1.ordinal());
		System.out.println(season1.getValue());
		System.out.println(Arrays.toString(Season.values()));
		
	}
}
