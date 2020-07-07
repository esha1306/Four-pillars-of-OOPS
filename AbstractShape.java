abstract class AbstractShape {
	abstract void draw();
}

class Triangle extends AbstractShape{
	void draw() {
		System.out.println("Please draw triangle shape");
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		AbstractShape obj = new Triangle();
		obj.draw();
	}
}
