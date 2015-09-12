package br.com.heiderlopes.demomultitelasandroid;

import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable {
	private static final long serialVersionUID = -6099312954099962806L;
	private String title;
	private String body;

	public Item(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public static ArrayList<Item> getItems() {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Cupcake", "Versão 1.5"));
		items.add(new Item("Donut", "Versão 1.6"));
		items.add(new Item("Eclair", "Versão 2.0/2.1"));
		items.add(new Item("Froyo", "Versão 2.2"));
		items.add(new Item("Gingerbread", "Versão 2.3"));
		items.add(new Item("HoneyComb", "Versão 3.0"));
		items.add(new Item("Ice Cream Sandwich", "Versão 4.0"));
		items.add(new Item("JellyBeans", "Versão 4.1"));
		items.add(new Item("Kit Kat", "Versão 4.4"));
		items.add(new Item("Lollipop", "Versão 5"));
		items.add(new Item("Marshmellow", "Versão 6"));
		return items;
	}

	@Override
	public String toString() {
		return getTitle();
	}

}
