package main.app.role;

public class Civilian extends Player{

	public Civilian(int number) {
		super(number);
		this.setRole(Role.CIVILIAN);
	}
	
}
