package concorrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounteWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void inrementI() {
		i.incrementAndGet();
	}
	
	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}
	
	public int getJ() {
		return j.get();
	}
	
	
}
