package tipAndTricks;

import java.util.Arrays;

enum Season{
	WINTER, SUMMER, FALL, SPRING
}

public class EnumRunner {
	public static void main(String[] args) {
		Season season1 = Season.FALL;
		season1 = Season.valueOf("SPRING");
	
		System.out.println(season1);
		System.out.println(season1.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		
	}
}
