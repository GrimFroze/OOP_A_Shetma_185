package com.game;// The code is part of the com.game package.

public class hero extends gameCharacter {// The hero class represents a hero character in the game.

    private String skill;// A private field to store the skill of the hero.

    public hero(String name, int health, String skill) {// The constructor initializes a hero object with a name,
                                                        // health,
                                                        // and skill. The skill is stored in the private field.
        super(name, health);// Calls the constructor of the superclass with the name and health.
        this.setSkill(skill);// Sets the skill of the hero.
    }

    public String getSkill() {// A getter method to get the skill of the hero.
        return skill;// Returns the skill of the hero.
    }

    public void setSkill(String skill) {// A setter method to set the skill of the hero.
        this.skill = skill;// Sets the skill of the hero.
    }

    @Override // The attack method is overridden to provide the specific behavior of the hero
    public void attack(gameCharacter target) {// The hero attacks another character.
        System.out.println(
                FRT_ITALICString + super.getName() + " attacks " + target.getName() + " Using a " + this.getSkill()
                        + "!" + FRT_RESET);// Prints the attack message with the hero's name, target's name, and skill.
        target.setHealth(target.getHealth() - 20);// Reduces the target's health by 20.
        System.out.println(target.getName() + " Now Has " + ANSI_RED + target.getHealth() + ANSI_RESET + ANSI_YELLOW
                + " Health\n" + ANSI_RESET);// Prints the target's updated health.
    }

    public String toString() {// The toString method is overridden to provide the specific string
                              // representation of the
                              // hero.
        return super.toString() + "Skill : " + ANSI_GREEN + this.getSkill() + ANSI_RESET + "\n";
    }
}
