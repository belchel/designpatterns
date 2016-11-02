package cap9_ITERATOR;

public class MenuItem {
	private String nome;
	private String desc;
	private String preco;
	
	public MenuItem(String nome, String desc, String preco){
		this.nome = nome;
		this.desc = desc;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getDesc() {
		return desc;
	}

	public String getPreco() {
		return preco;
	}



}
