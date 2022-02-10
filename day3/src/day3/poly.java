package day3;

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}
class Robin extends Bird{
	public void sing(String song) {
		System.out.println("twiddledeedee");
	}
}

public class poly {

	public static void main(String[] args) {
		Robin b = new Robin(); 
		b.sing();

	}

}