package com.atuldwivedi.springseason.autowiring.autodetect;

public class Team {
	private Captain captain;

	public Team(Captain captain) {
		this.captain = captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Team [captain=" + captain + "]";
	}

}
