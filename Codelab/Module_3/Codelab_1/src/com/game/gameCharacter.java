package com.game;//The code is part of the com.game package.

public class gameCharacter {// The gameCharacter class represents a character in the game.

    private String name;// A private field to store the name of the character.
    private int health;// A private field to store the health of the character.

    String ANSI_RESET = "\u001B[0m", ANSI_YELLOW = "\u001B[33m", ANSI_RED = "\u001B[31m",
            ANSI_GREEN = "\u001B[32m";// ANSI escape codes for text color.

    String FRT_ITALICString = "\033[3m", FRT_RESET = "\033[0m";// ANSI escape codes for italic text.

    public gameCharacter(String name, int health) {// The constructor initializes a gameCharacter object with a name and
                                                   // health.
        this.setName(name);// Sets the name of the character.
        this.setHealth(health);// Sets the health of the character.
    }

    public String getName() {// A getter method to get the name of the character.
        return name;// Returns the name of the character.
    }

    public int getHealth() {// A getter method to get the health of the character.
        return health;// Returns the health of the character.
    }

    public void setHealth(int health) {// A setter method to set the health of the character.
        this.health = health;// Sets the health of the character.
    }

    public void setName(String name) {// A setter method to set the name of the character.
        this.name = name;// Sets the name of the character.
    }

    public void attack(gameCharacter target) {// A method to attack another character.
    }

    public String toString() { // A method to return the string representation of the character.
        return "\n" + this.getName() + " has health : " + ANSI_RED + this.getHealth() + ANSI_RESET + ANSI_YELLOW
                + " HP\n" + ANSI_RESET;// Returns a string representation of the character, including their name and
                                       // health, formatted with ANSI color codes.

    }
}
