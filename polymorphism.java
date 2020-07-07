
public class polymorphism {

	public static void main(String[] args) {
		Color c = new Purple();
		c.paint();
	}
}

class Color{
	void paint() {
		System.out.println("Painting using color");
	}
}

class Purple extends Color {
	void paint() {
		System.out.println("Painting the wall using purple brush ");
	}
}