
public class Animal { // declares a public class named Animal
    String Name, Type, Sound; // declares three instance variables (fields) of type String named Name, Type,
                              // and Sound. These fields will hold the name, type, and sound of the animal,
                              // respectively.

    void showInfo() { // declares a method named showInfo that does not return any value (void). This
                      // method will display the information of the animal.
        System.out.println("Name: " + Name);// prints the name of the animal
        System.out.println("Type: " + Type);// prints the type of the animal
        System.out.println("Sound: " + Sound);// prints the sound of the animal
        System.out.println();// prints an empty line for better readability.
    };
}
