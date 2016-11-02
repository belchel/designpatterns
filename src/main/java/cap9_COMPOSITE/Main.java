package cap9_COMPOSITE;

public class Main {

	public static void main(String[] args) {
		MenuItem item = new MenuItem("1", "desc1", "1,99");
		MenuItem item2 = new MenuItem("2", "desc2", "2,99");
		MenuItem item3 = new MenuItem("3", "desc3", "3,99");

		MenuComponente almoco = new Menu("ALMOCO MENU", "Almoco");
		MenuComponente janta = new Menu("JANTAR MENU", "Janta");
		almoco.add(item);
		almoco.add(item2);
		janta.add(item3);
		
		MenuComponente allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(almoco);
		allMenus.add(janta);
		Garcom garcom = new Garcom(allMenus);
		garcom.showMenu();
	}

}