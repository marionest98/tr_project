package com.mytest.test02;

public class Radio implements Volume {
	private int VolLevel;
	Radio(){}
	

	public Radio(int VolLevel) {
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
		System.out.println("Radio볼륨 올립니다."+VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		System.out.println("Radio볼륨 내립니다."+VolLevel);

	}

}
