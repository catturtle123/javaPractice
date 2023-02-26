package tipAndTricks;


public enum Season{
	WINTER(4), SUMMER(2), FALL(3), SPRING(1);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}