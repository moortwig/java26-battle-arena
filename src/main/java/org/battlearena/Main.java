package org.battlearena;

import org.battlearena.game.Setup;

import java.util.Scanner;

public class Main {
    static void main() {
        new Game(
                new Scanner(System.in),
                new Setup()
        ).run();
    }
}
