package tipAndTricks;

import java.util.Objects;

class Client {
	private int i;
	private int j;

	public Client(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return i == other.i;
	}
}



public class Equals {
	public static void main(String[] args) {
		Client c1 = new Client(1,2);
		Client c2 = new Client(1,3);
		
		
		System.out.println(c1.equals(c2));
		
	}
}
