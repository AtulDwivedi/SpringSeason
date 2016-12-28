package com.atuldwivedi.springseason.autowiring.bytype;

public class MusicSystem {
	private String musicSystemCompany;

	public void setMusicSystemCompany(String musicSystemCompany) {
		this.musicSystemCompany = musicSystemCompany;
	}

	@Override
	public String toString() {
		return "MusicSystem [musicSystemCompany=" + musicSystemCompany + "]";
	}
}
