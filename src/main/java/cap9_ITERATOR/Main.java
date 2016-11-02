package cap9_ITERATOR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		MenuItem item = new MenuItem("1","desc1","1,99");
		MenuItem item2 = new MenuItem("2","desc2","2,99");
		MenuItem item3 = new MenuItem("3","desc3","3,99");
		
		MenuItem[] menuItems = {item,item2,item3};
		
		List<MenuItem> listaItems = new ArrayList<>();
		listaItems.addAll(Arrays.asList(menuItems));
		MenuJantar janta = new MenuJantar();
		janta.setMenuItems(menuItems);
		MenuAlmoco almoco = new MenuAlmoco();
		almoco.setMenuItems(listaItems);
		
		Garcom garcom = new Garcom(almoco,janta);
		garcom.showMenu();
	}
	
	
}
