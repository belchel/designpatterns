package cap8_TEMPLATE;

public class Cha extends Cafeina {

	public Cha(){
		this.descricao = "ch�";
	}
	
	@Override
	void misturar() {
		System.out.println("Misturando "+ descricao);
	}

	@Override
	void addCondimentos() {
		System.out.println("Add condimentos do "+ descricao);
	}


}
