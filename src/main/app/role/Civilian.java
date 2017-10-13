package main.app.role;

import main.app.team.GoodTeam;

public class Civilian extends Player{

	public Civilian(int number, GoodTeam goodTeam) {
		super(number, goodTeam);
		this.setRole(Role.CIVILIAN);
		this.setTeam(goodTeam);
	}
	
}
