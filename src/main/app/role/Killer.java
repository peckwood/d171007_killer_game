package main.app.role;

public class Killer extends Player implements NightOwl{
	
	@Override
	public void doNightAction() {
		
	}

	public Killer(int number) {
		super(number);
		this.setRole(Role.KILLER);
	}



	public void kill(Player victim) {
		victim.setStatus(Status.WOUNDED);
	}
	
}
