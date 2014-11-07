package com.academysmart;

public class RealKnight {
private Quest quest;
	
	public RealKnight(Quest quest) {
		this.quest = quest;
	}
	public void embarkOnQuest() {
		quest.embark();
	}

}
