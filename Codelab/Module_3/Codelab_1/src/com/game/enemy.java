package com.game;// The code is part of the com.game package.

public class enemy extends gameCharacter {// The enemy class represents an enemy character in the game.

    private String skill;// A private field to store the skill of the enemy.

    public enemy(String name, int health, String skill) {// The constructor initializes an enemy object with a name,
                                                         // health,
                                                         // and skill. The skill is stored in the private field.
        super(name, health);// Calls the constructor of the superclass with the name and health.
        this.setSkill(skill);// Sets the skill of the enemy.
    }

    public String getSkill() {// A getter method to get the skill of the enemy.
        return skill;// Returns the skill of the enemy.
    }

    public void setSkill(String skill) {// A setter method to set the skill of the enemy.
        this.skill = skill;// Sets the skill of the enemy.
    }

    @Override // The attack method is overridden to provide the specific behavior of the enemy
    public void attack(gameCharacter target) {// The enemy attacks another character.
        System.out.println(
                FRT_ITALICString + super.getName() + " attacks " + target.getName() + " Using a " + this.getSkill()
                        + "!" + FRT_RESET);// Prints the attack message with the enemy's name, target's name, and skill.
        target.setHealth(target.getHealth() - 15);// Reduces the target's health by 15.
        System.out.println(target.getName() + " Now Has " + ANSI_RED + target.getHealth() + ANSI_RESET + ANSI_YELLOW
                + " Health\n" + ANSI_RESET);// Prints the target's updated health.
    }

    public String toString() {// The toString method is overridden to provide the specific string
                              // representation of the
                              // enemy.
        return super.toString() + "Skill : " + ANSI_GREEN + this.getSkill() + ANSI_RESET + "\n";// Returns a string
                                                                                                // representation of the
                                                                                                // enemy, including
                                                                                                // their
                                                                                                // name, health, and
                                                                                                // skill.
    }
}
