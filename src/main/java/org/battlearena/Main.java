package org.battlearena;

import org.battlearena.game.Setup;

import java.util.Scanner;

public class Main {
    static void main() {
        new BattleArena(
                new Scanner(System.in),
                new Setup()
        ).run();
    }
}
