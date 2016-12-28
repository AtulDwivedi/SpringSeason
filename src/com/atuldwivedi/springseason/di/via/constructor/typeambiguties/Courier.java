package com.atuldwivedi.springseason.di.via.constructor.typeambiguties;

public class Courier {
	private long courierId;
	private String fromLocation;
	private String toLocation;
	private float cost;

	public long getCourierId() {
		return courierId;
	}

	public void setCourierId(long courierId) {
		this.courierId = courierId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Courier(String fromLocation, String toLocation) {
		super();
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}

	public Courier(long courierId, String fromLocation) {
		super();
		this.courierId = courierId;
		this.fromLocation = fromLocation;
	}

	public Courier(String toLocation, float cost) {
		super();
		this.toLocation = toLocation;
		this.cost = cost;
	}

	public Courier(float cost, String fromLocation) {
		super();
		this.fromLocation = fromLocation;
		this.cost = cost;
	}

	public void displayData() {
		System.out.println("Courier Id: " + courierId);
		System.out.println("From Location: " + fromLocation);
		System.out.println("To Location: " + toLocation);
		System.out.println("Courier cost: " + cost);
	}

	@Override
	public String toString() {
		return "Courier [courierId=" + courierId + ", fromLocation="
				+ fromLocation + ", toLocation=" + toLocation + ", cost="
				+ cost + "]";
	}

}
