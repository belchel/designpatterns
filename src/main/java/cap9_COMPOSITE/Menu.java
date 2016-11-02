package cap9_COMPOSITE;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponente {
	ArrayList<MenuComponente> menuComponentes = new ArrayList<>();
	String nome;
	String desc;

	public Menu(String nome, String desc) {
		this.desc = desc;
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public String getDesc() {
		return desc;
	}

	public void add(MenuComponente menuComponent) {
		menuComponentes.add(menuComponent);
	}

	public void remove(MenuComponente menuComponent) {
		menuComponentes.remove(menuComponent);
	}

	public MenuComponente getChild(int i) {
		return menuComponentes.get(i);
	}

	public void show() {
		System.out.println(getNome());
		System.out.println(getDesc());
		Iterator<MenuComponente> iterator = menuComponentes.iterator();
		while (iterator.hasNext()) {
			MenuComponente menuComponent = iterator.next();	
			menuComponent.show();
		}
	}

}
