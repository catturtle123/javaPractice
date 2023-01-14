package switchPractice;

public class SwitchPractice {
	public static void main(String[] args) {
		System.out.println(isWeekDay(1));
		System.out.println(determineNameOfMonth(5));
		System.out.println(determineNameOfDay(5));
	}

	private static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		default:
			return "유효하지 않음";
		}

	}

	private static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "1월";
		case 2:
			return "2월";
		case 3:
			return "3월";
		case 4:
			return "4월";
		case 5:
			return "5월";
		case 6:
			return "6월";
		case 7:
			return "7월";
		case 8:
			return "8월";
		case 9:
			return "9월";
		case 10:
			return "10월";
		case 11:
			return "11월";
		case 12:
			return "12월";
		default:
			return "유효하지 않음";
		}

	}

	private static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		default:
			return false;
		}
	}
}
