package cap9_ITERATOR;

public class MenuJantar {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	private MenuItem[] menuItems;

	public Iterator<MenuItem> createIterator() {
		return new MenuJantarIterator(getMenuItems());
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
}
