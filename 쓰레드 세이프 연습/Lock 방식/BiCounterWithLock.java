package concorrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounteWithLock {
	private int i = 0;
	private int j = 0;
	
	Lock LockI = new ReentrantLock();
	Lock LockJ = new ReentrantLock();
	
	public void inrementI() {
		LockI.lock();
		i++;
		LockI.unlock();
	}
	
	public void incrementJ() {
		LockJ.lock();
		j++;
		LockJ.unlock();
	}

	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
	
	
}
