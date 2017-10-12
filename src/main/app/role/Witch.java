package main.app.role;

public class Witch extends Player implements NightOwl{

	private int cureCount = 1;
	private int poisonCount = 1;
	
	public Witch(int number) {
		super(number);
		this.setRole(Role.WITCH);
	}
	
	private void poison(Player player){
		if(poisonCount>0){
			poisonCount--;
		}
	}
	
	private void cure(Player player){
		if(cureCount>0){
			cureCount--;
		}
	}

	@Override
	public void doNightAction() {
		//TODO
		Player friend = null; 
		Player victim = null;
		if(cureCount>0){
			cure(friend);
		}
		if(poisonCount>0){
			poison(victim);
		}
		
	}
}
