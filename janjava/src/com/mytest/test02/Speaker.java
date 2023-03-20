package com.mytest.test02;

public class Speaker implements Volume {
	private int VolLevel;

	Speaker() {}
	

	public Speaker(int VolLevel) {
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
		if (VolLevel > 100) {
			VolLevel = 100;
		}
		System.out.println("speak볼륨 올립니다."+VolLevel);

	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		if (VolLevel < 0) {
			VolLevel = 0;
		}
		System.out.println("speak볼륨 내립니다."+VolLevel);
	}

}
