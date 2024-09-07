package com.GamingDemo;

public class GameRunner {

    GamingConsole game;

    GameRunner(GamingConsole game){
        this.game = game;
    }

    void run(){
        System.out.println("Running Game "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
