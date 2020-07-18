package com.cricketfoursix.cricketdomain.common.squad;

public class SquadPlayer {
    private String playerName;
    private int role = 9;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SquadPlayer{" +
                "playerName='" + playerName + '\'' +
                ", role=" + role +
                '}';
    }
}
