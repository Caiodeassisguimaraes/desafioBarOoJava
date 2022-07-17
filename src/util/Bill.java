package util;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softdrink;
	
	public double ticket () {
		if (gender == 'F') {
			return 8.00;
		} else {
			return 10.00;
		}
	}
	
	public double feeding () {
		return (beer * 5) + (softdrink * 3)+ (barbecue * 7);
	}

	public double cover () {
		
		if ((feeding ()) < 30) {
			return 4.00;
		} else {
			return 0.00;
		}
	}
	public double total () {
		return (ticket () + feeding () + cover ());
	}
}
