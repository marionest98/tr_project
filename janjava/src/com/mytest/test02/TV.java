package com.mytest.test02;

public class TV implements Volume {
	private int VolLevel;

	TV() {
	}

	public TV(int VolLevel) {
		this.VolLevel = VolLevel;
	}

	public int getVolLevel() {
		return VolLevel;
	}

	public void setVolLevel(int VolLevel) {
		this.VolLevel = VolLevel;
	}

	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println("TV볼륨 올립니다."+VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		if (VolLevel < 0) {
			VolLevel = 0;
		}
		System.out.println("TV볼륨 내립니다."+VolLevel);

	}

}
