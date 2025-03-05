package com.example.services;

import com.example.models.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayer(int id, Player updatedPlayer) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == id) {
                players.set(i, updatedPlayer);
                break;
            }
        }
    }

    public Player getPlayer(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    public List<Player> getAllPlayers() {
        return players;
    }

    public void deletePlayer(int id) {
        players.removeIf(player -> player.getId() == id);
    }
}