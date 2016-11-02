package cap8_TEMPLATE;

public class Cafe extends Cafeina {

	public Cafe(){
		this.descricao = "café";
	}
			
	@Override
	void misturar() {
		System.out.println("Misturando "+ descricao);
	}

	@Override
	void addCondimentos() {
		System.out.println("Add condimentos do " + descricao);
	}

}
