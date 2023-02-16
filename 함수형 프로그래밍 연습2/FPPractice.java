package fPPractcie;

import java.util.List;
import java.util.function.Consumer;

class printEach implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}



public class FPPractice {
	public static void main(String[] args) {
		List.of(1,2,3,4).stream().filter(FPPractice::hey).forEach(new printEach());
	}
	
	public static boolean hey(Integer i) {
		return i % 2 == 0;
	}
}
