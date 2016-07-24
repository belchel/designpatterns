package cap1_STRATEGY;

public class NoFly implements FlyBehavior {

	public void fly(String nome) {
		System.out.println(nome + " cant fly =(");
	}

}
