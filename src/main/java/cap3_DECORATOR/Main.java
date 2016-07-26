package cap3_DECORATOR;

public class Main {
	
	public static void main(String[] args) {
		Beverage bev = new Espresso(Size.GRANDE);
		bev = new Mocha(bev);
		bev = new Milk(bev);
		System.out.println(bev.getDescription() + " $$ "+ bev.cost());
	}
}
