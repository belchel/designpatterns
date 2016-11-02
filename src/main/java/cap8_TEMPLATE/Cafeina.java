package cap8_TEMPLATE;

public abstract class Cafeina {
	
	protected String descricao = "";
	
	final void preparar() {
		ferverAgua();
		misturar();
		servir();
		addCondimentos();
	}

	abstract void misturar();

	abstract void addCondimentos();

	void ferverAgua() {
		System.out.println("Fervendo " + descricao );
	}

	void servir() {
		System.out.println("Servindo " + descricao );
	}
}
