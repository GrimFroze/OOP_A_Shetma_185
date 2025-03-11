public class Main { // declares a public class named Main
    public static void main(String[] args) throws Exception {// this is the main method which serves as the entry point
                                                             // for the program. The throws Exception part indicates
                                                             // that this method might throw an exception.
        // Creating Objects
        Animal animal1 = new Animal();// Animal animal1 = new Animal(); and Animal animal2 = new Animal(); create two
                                      // instances of the Animal class named animal1 and animal2.
        Animal animal2 = new Animal();

        animal1.Name = "Cat";// sets the Name property of animal1 to "Cat".
        animal1.Type = "Mammal";// sets the Type property of animal1 to "Mammal".
        animal1.Sound = "Nyann~~";// sets the Sound property of animal1 to "Nyann~~".

        animal2.Name = "Dog"; // sets the Name property of animal2 to "Dog".
        animal2.Type = "Mammal"; // sets the Type property of animal2 to "Mammal".
        animal2.Sound = "Woof-Woof!!"; // sets the Sound property of animal2 to "Woof-Woof!!".

        animal1.showInfo(); // Calls the showInfo method on animal1 to display its information.
        animal2.showInfo(); // Calls the showInfo method on animal2 to display its information.

    }
}
