package com.atuldwivedi.springseason.autowiring.bytype;

public class Car {
	private MusicSystem musicSystem;

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Car [musicSystem=" + musicSystem + "]";
	}
}
