package main.app.role;

public class Seer extends Player implements NightOwl{
	
	@Override
	public void doNightAction() {
		
	}

	public Seer(int number) {
		super(number);
		this.setRole(Role.SEER);
	}

	public Role identify(Player identified) {
		return identified.getRole();
	}
	
}
