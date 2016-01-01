package generics.custom.classes;

import java.util.List;

public class Library<T> {

	private List<T> items;

	public Library(List<T> items) {
		this.items = items;
	}
	
	public T issueItem(){
		return items.get(0);
	}
	
	public void returnItem(T item){
		items.add(item);
	}

	@Override
	public String toString() {
		return "Library [items=" + items + "]";
	}
}
