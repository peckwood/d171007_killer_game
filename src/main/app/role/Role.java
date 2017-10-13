package main.app.role;

import main.app.team.Team;

public enum Role {
	
	KILLER(true, 1)
	, SEER(true, 2)
	, WITCH(true, 3)
	, GUARDIAN(true, 4)
	, CIVILIAN(false, 0);
	
	private final boolean HAS_NIGHT_ACTION;
	private final int NIGHT_ORDER;
	private Role(boolean hAS_NIGHT_ACTION, int nIGHT_ORDER) {
		HAS_NIGHT_ACTION = hAS_NIGHT_ACTION;
		NIGHT_ORDER = nIGHT_ORDER;
	}
	public boolean isHAS_NIGHT_ACTION() {
		return HAS_NIGHT_ACTION;
	}
	public int getNIGHT_ORDER() {
		return NIGHT_ORDER;
	}
	
	
}
