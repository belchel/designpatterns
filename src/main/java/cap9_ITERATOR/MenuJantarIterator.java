package cap9_ITERATOR;


public class MenuJantarIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;

	public MenuJantarIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null){
			return false;
		}else 
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
