package cap7_FACADE;

public class Main {
	public static void main(String[] args) {
		MovieFacade  facade =  new MovieFacade(new Amplifier(), new DvdPlayer(), new Television());
		facade.watchNow();
		
	}
}
