package main.app.role;

public class Guardian extends Player implements NightOwl{
	
	public Guardian(int number) {
		super(number);
		this.setRole(Role.GUARDIAN);
	}

	@Override
	public void doNightAction() {
		
	}


	public void guard(Player target) {
		
	}
	
}
