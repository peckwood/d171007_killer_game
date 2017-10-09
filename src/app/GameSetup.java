package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import app.role.Killer;
import app.role.Player;

public class GameSetup {
	List<Player> players;
	int totalCount;
	int seerCount;
	int killerCount;
	int guardianCount;
	int witchCount;
	int civilianCount;
	
	private void setup(String counterText) {
		String[] counts = counterText.split("");
		totalCount = Integer.valueOf(counts[0]);
		seerCount = Integer.valueOf(counts[1]);
		killerCount = Integer.valueOf(counts[2]);
		guardianCount = Integer.valueOf(counts[3]);
		witchCount = Integer.valueOf(counts[4]);
		civilianCount = totalCount - seerCount - killerCount - guardianCount - witchCount;
		
	}
	private void assignRoles() {
		Random random = new Random();

		int totalToCreate = totalCount;
		int killersToCreate = killerCount;
		int seerCountsToCreate = seerCount;
		int guardianCountsToCreate = guardianCount;
		int witchCountsToCreate = witchCount;
		int civilianCountsToCreate = civilianCount;
		
		
		Map<Integer, Player> players = new HashMap<>();
		for(int playerNumber=1;playerNumber<=totalToCreate;playerNumber++) {
			players.put(playerNumber, null);
		}
		
		//a list contain the number of players
		List<Integer> unassignedPlayers = new ArrayList<>();
		//an array contain the number of players
		//int[] unassgnedPlayers = new int[totalToCreate];
		for(int i=0;i<totalToCreate;i++) {
			unassignedPlayers.set(i, i+1);
		}
		
		while(unassignedPlayers.size()>0) {
			int toAssignPlayerIndex = random.nextInt(unassignedPlayers.size());
			Player player = null;
			if(killersToCreate > 0) {
				player = new Killer(unassignedPlayers.get(toAssignPlayerIndex));
				unassignedPlayers.remove(toAssignPlayerIndex);
				killersToCreate--;
			}else if(seerCount>0) {
				
			}
		}
		

		int choiceCount = killersToCreate>0?1:0 + seerCountsToCreate>0?1:0 + 
				guardianCountsToCreate>0?1:0 + witchCountsToCreate>0?1:0 + civilianCountsToCreate>0?1:0;
		for(int totalCount1 = 1;totalCount1<=totalCount;totalCount1++) {
			
			int nextInt = random.nextInt(choiceCount);
			
		}
		
		
		
		
	}
	
	
}

