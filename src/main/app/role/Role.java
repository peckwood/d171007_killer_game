package main.app.role;

public enum Role {
	
	KILLER(true, 1, Team.EVIL)
	, SEER(true, 2, Team.GOOD)
	, WITCH(true, 3, Team.GOOD)
	, GUARDIAN(true, 4, Team.GOOD)
	, CIVILIAN(false, 0, Team.GOOD);
	
	private final boolean HAS_NIGHT_ACTION;
	private final int NIGHT_ORDER;
	private final Team TEAM;
	private Role(boolean hAS_NIGHT_ACTION, int nIGHT_ORDER, Team tEAM) {
		HAS_NIGHT_ACTION = hAS_NIGHT_ACTION;
		NIGHT_ORDER = nIGHT_ORDER;
		TEAM = tEAM;
	}
	
	
}
