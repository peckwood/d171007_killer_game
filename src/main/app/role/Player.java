package main.app.role;

import main.app.Status;
import main.app.team.Team;

public class Player {
	//号码
	private int number;
	private String nickname;
	private Status status = Status.ALIVE;
	private Role role;
	private Team team;
	
	private Player killedBy;
	private int roundKilled;

	public Player(int number, Team team) {
		this.number = number;
		this.team = team;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Player getKilledBy() {
		return killedBy;
	}
	public void setKilledBy(Player killedBy) {
		this.killedBy = killedBy;
	}
	public int getRoundKilled() {
		return roundKilled;
	}
	public void setRoundKilled(int roundKilled) {
		this.roundKilled = roundKilled;
	}
	
	public Role getRole() {
		return role;
	}
	
	
	public void setRole(Role role) {
		this.role = role;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
