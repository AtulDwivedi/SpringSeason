package com.atuldwivedi.springseason.core.spel;

public class Item {
	private String itemName;
	private int itemQty;
	private double price;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemQty=" + itemQty
				+ ", price=" + price + "]";
	}
}
