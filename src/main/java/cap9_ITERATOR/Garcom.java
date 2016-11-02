package cap9_ITERATOR;

public class Garcom {
	MenuAlmoco menuAlmoco;
	MenuJantar menuJanta;
	
	public Garcom(MenuAlmoco menuAlmoco,MenuJantar menuJanta){
		this.menuAlmoco=menuAlmoco;
		this.menuJanta=menuJanta;
	}
	
	public void showMenu(){
		Iterator<MenuItem> almocoIterator = menuAlmoco.createIterator();
		Iterator<MenuItem> jantaIterator = menuJanta.createIterator();
		
		System.out.println("Menu Almoço");
		showMenu(almocoIterator);
		System.out.println("Menu Janta");
		showMenu(jantaIterator);
	}
	
	
	public void showMenu(Iterator<MenuItem> it){
		while(it.hasNext()){
			MenuItem menuItem= it.next();
			System.out.println(menuItem.getNome());
			System.out.println(menuItem.getDesc());
			System.out.println(menuItem.getPreco());
		}
		
	}
}
