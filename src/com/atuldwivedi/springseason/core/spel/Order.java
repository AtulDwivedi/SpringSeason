package com.atuldwivedi.springseason.core.spel;

public class Order {

	private String orderId;
	private Item item;
	private String itemName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", item=" + item + ", itemName="
				+ itemName + "]";
	}
}
