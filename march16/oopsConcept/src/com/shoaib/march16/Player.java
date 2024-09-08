package com.shoaib.march16;

public class Player {
	public int playerId;
	public String playerName;
	
	public void setPlayerName(int playerId, String playerName)
	{
		this.playerId = playerId;
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + 		playerName + "]";
	}
	
	
}
