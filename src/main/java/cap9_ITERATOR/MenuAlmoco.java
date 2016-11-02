package cap9_ITERATOR;

import java.util.List;

public class MenuAlmoco {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	private List<MenuItem> menuItems;

	public Iterator<MenuItem> createIterator() {
		return new MenuAlmocoIterator(getMenuItems());
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
}
