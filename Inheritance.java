
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p = new people();
			p.stand();
			p.standard();	 
 }
}

class community{
	void standard() {
		System.out.println("Community");
	}
}
class people extends community{
	void stand() {
		System.out.println("People");
	}
}