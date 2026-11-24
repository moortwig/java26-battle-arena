package org.battlearena;

import org.battlearena.game.Setup;

import java.util.Scanner;

public class BattleArena {
    private Scanner scanner;
    private Setup setup;

    public BattleArena(Scanner scanner, Setup setup) {
        this.scanner = scanner;
        this.setup = setup;
    }

    public void run() {
        IO.println("Shall we play a game?");

        setup.setupGame();

        playTurn();
        checkGameOver();

        displayGameOver();
    }


    protected void playTurn() {
        // Spelaren och datorn turas om att göra en handling
        // Både spelaren och datorn ska kunna göra två olika handlingar under sin tur.
        // En av handlingarna ska vara ATTACK. Den andra väljer ni själva, till exempel HEAL, DEFEND eller en specialförmåga.
        // Datorns val ska vara slumpmässigt
        // Resultatet visas efter varje handling (i terminalen)
        // Efter varje handling ska programmet visa vad som hände och hur mycket HP spelaren och datorn har kvar.
        // HP får aldrig bli mindre än 0
    }

    protected void checkGameOver() {
        // Matchen avslutas när spelaren eller datorn har 0 HP
    }

    protected void displayGameOver() {
        // Programmet ska tydligt visa vem som vann
    }
}
