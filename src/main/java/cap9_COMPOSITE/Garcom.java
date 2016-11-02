package cap9_COMPOSITE;

public class Garcom {
	MenuComponente allMenus;
	
	public Garcom(MenuComponente allMenus){
		this.allMenus=allMenus;
	}
	
	public void showMenu(){
		this.allMenus.show();
	}
	
}
