package main.app.role;

import main.app.Status;
import main.app.team.EvilTeam;

public class Killer extends Player implements NightOwl{
	
	@Override
	public void doNightAction() {
		
	}

	public Killer(int number, EvilTeam evilTeam) {
		super(number, evilTeam);
		this.setRole(Role.KILLER);
	}



	public void kill(Player victim) {
		victim.setStatus(Status.WOUNDED);
		
	}
	
}
