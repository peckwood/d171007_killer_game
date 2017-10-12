package main.app;

import java.util.List;
import java.util.Scanner;

import main.app.role.Player;

public class Game {
	private List<Player> players;
	private int round;
	private String log;
	Scanner input  = new Scanner(System.in);
	
	private void setup() throws Exception {
		System.out.println("Type number of players:");
		System.out.println("total | killer | seer | guardian | witch");
		
		int totalCount = input.nextInt();
		int seer = input.nextInt();
		int killerCount = input.nextInt();
		int guardianCount = input.nextInt();
		int witchCount = input.nextInt();
		int civilianCount = totalCount - seer - killerCount - guardianCount - witchCount;
		if(civilianCount<0) {
			throw new Exception();
		}
	}
	private void assignRoles() {
		
	}
	
}
