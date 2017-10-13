package main.app.role;

import main.app.team.GoodTeam;

public class Guardian extends Player implements NightOwl{
	
	public Guardian(int number, GoodTeam goodTeam) {
		super(number, goodTeam);
		this.setRole(Role.GUARDIAN);
	}

	@Override
	public void doNightAction() {
		
	}


	public void guard(Player target) {
		
	}
	
}
