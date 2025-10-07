package org.example.staticfinalmod;

public class GameSettings {

    static int maxPlayers;
    final String GAME_NAME;
    int currentPlayers;

    GameSettings(String gameName) {
        this.GAME_NAME = gameName;
        //currentPlayers не передаю в конструкторе, чтобы при создании не указать количество больше maxPlayers
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        if (this.currentPlayers < maxPlayers) {
            this.currentPlayers++;
            System.out.println("Игрок добавлен. Текущее количество игроков " + this.currentPlayers);
        }
        else {
            System.out.println("Превышено максимальное количество игроков " + maxPlayers);
        }
    }

    public void printGameStatus() {
        System.out.println("Название игры " + this.GAME_NAME + "\n"
                + "Текущее количество ироков " + this.currentPlayers + "\n"
                + "Максимальное количество игроков" + maxPlayers);
    }
}
