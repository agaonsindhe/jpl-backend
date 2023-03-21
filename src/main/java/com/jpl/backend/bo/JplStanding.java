package com.jpl.backend.bo;

import java.io.Serializable;

public class JplStanding implements Serializable{
	
	private static final long serialVersionUID = 6679557507412714942L;
	private int rank;
	private String managerName;
	private String teamName;
	private double currentGameWeekPts;
	private double totalPoints;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public double getCurrentGameWeekPts() {
		return currentGameWeekPts;
	}
	public void setCurrentGameWeekPts(double currentGameWeekPts) {
		this.currentGameWeekPts = currentGameWeekPts;
	}
	public double getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}
	@Override
	public String toString() {
		return "JplStanding [rank=" + rank + ", managerName=" + managerName + ", teamName=" + teamName
				+ ", currentGameWeekPts=" + currentGameWeekPts + ", totalPoints=" + totalPoints + "]";
	}
	
}
