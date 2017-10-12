package main.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import main.app.role.Civilian;
import main.app.role.Guardian;
import main.app.role.Killer;
import main.app.role.Player;
import main.app.role.Role;
import main.app.role.Seer;
import main.app.role.Witch;

public class GameSetup {
	List<Player> players;
	int totalCount;
	int seerCount;
	int killerCount;
	int guardianCount;
	int witchCount;
	int civilianCount;
	
	public void setup(String counterText) {
		String[] counts = counterText.split(" ");//只支持一个空格
		totalCount = Integer.valueOf(counts[0]);
		killerCount = Integer.valueOf(counts[1]);
		seerCount = Integer.valueOf(counts[2]);
		witchCount = Integer.valueOf(counts[3]);
		guardianCount = Integer.valueOf(counts[4]);
		civilianCount = totalCount - seerCount - killerCount - guardianCount - witchCount;
		Map<Role, Integer> roleMap = new HashMap<>();
		roleMap.put(Role.KILLER, killerCount);
		roleMap.put(Role.SEER, seerCount);
		roleMap.put(Role.WITCH, witchCount );
		roleMap.put(Role.GUARDIAN, guardianCount);
		roleMap.put(Role.CIVILIAN, civilianCount);
		
		Role[] killerRoleArray = new Role[killerCount];
		Arrays.fill(killerRoleArray, Role.KILLER);
		Role[] seerRoleArray = new Role[seerCount];
		Arrays.fill(seerRoleArray, Role.SEER);
		Role[] witchRoleArray = new Role[witchCount];
		Arrays.fill(witchRoleArray, Role.WITCH);
		Role[] guardianRoleArray = new Role[guardianCount];
		Arrays.fill(guardianRoleArray, Role.GUARDIAN);
		Role[] civilianRoleArray = new Role[civilianCount];
		Arrays.fill(civilianRoleArray, Role.CIVILIAN);
		
		List<Role> allRoleList = new ArrayList<>();
		allRoleList.addAll(Arrays.asList(killerRoleArray));
		allRoleList.addAll(Arrays.asList(seerRoleArray));
		allRoleList.addAll(Arrays.asList(witchRoleArray));
		allRoleList.addAll(Arrays.asList(guardianRoleArray));
		allRoleList.addAll(Arrays.asList(civilianRoleArray));
		System.out.println(allRoleList);
		assignRoles(allRoleList);
		
		
		
	}
	private void assignRoles(List<Role> allRoleList) {
		
		Random random = new Random();
		List<Player> playersList = new ArrayList<>();
		for(int i=0;i<totalCount;i++){
			int currentPlayerNumber = i+1;
			int currentRoleIndex= random.nextInt(allRoleList.size());
			switch(allRoleList.get(currentRoleIndex)){
			case KILLER:
				playersList.add(new Killer(currentPlayerNumber));
				break;
			case SEER:
				playersList.add(new Seer(currentPlayerNumber));
				break;
			case WITCH:
				playersList.add(new Witch(currentPlayerNumber));
				break;
			case GUARDIAN:
				playersList.add(new Guardian(currentPlayerNumber));
				break;
			case CIVILIAN:
				playersList.add(new Civilian(currentPlayerNumber));
				break;
			}
			allRoleList.remove(currentRoleIndex);
		}
		System.out.println(playersList);
		
	}
	@Override
	public String toString() {
		return "GameSetup [players=" + players + ", totalCount=" + totalCount + ", seerCount=" + seerCount
				+ ", killerCount=" + killerCount + ", guardianCount=" + guardianCount + ", witchCount=" + witchCount
				+ ", civilianCount=" + civilianCount + "]";
	}
	
	
}

