package com.main;//this code is part of the main package

import com.game.enemy;//importing the enemy class from the game package
import com.game.gameCharacter;//importing the gameCharacter class from the game package
import com.game.hero;//importing the hero class from the game package

public class main { // The main class contains the main method, which is the entry point of the
                    // program.
    public static void main(String[] args) {// The main method is the entry point of the program.

        gameCharacter gameCharacter = new gameCharacter("General Character", 100);// creating an object of the
                                                                                  // gameCharacter of type gameCharacter
                                                                                  // with name "General Character" and
                                                                                  // health 100.
        hero hero = new hero("Brimstone", 150, "Sword");// creating an object of the hero of type hero with name
                                                        // "Brimstone", health 150, and weapon "Sword".
        enemy enemy = new enemy("Viper", 200, "Magic");// creating an object of the enemy of type enemy with name
                                                       // "Viper", health 200, and weapon "Magic".

        hero.setSkill("Orbital Strike");// The hero object is assigned the skill "Orbital Strike".
        enemy.setSkill("Snake Bite");// The enemy object is assigned the skill "Snake Bite".

        System.out.println("====================================");// printing the initial status of the game
        System.out.println("Initial Status :");// printing the initial status of the game
        System.out.print("====================================");// printing the initial status of the game
        System.out.println(hero.toString() + enemy.toString());// Prints the string representations of the hero and
                                                               // enemy objects, which likely include their current
                                                               // status.

        System.out.println("====================================");// printing the combat log
        System.out.println("Combat Log :");// printing the combat log
        System.out.println("====================================");// printing the combat log
        hero.attack(enemy);// hero attacking the enemy
        enemy.attack(hero);// enemy attacking the hero
    }
}
