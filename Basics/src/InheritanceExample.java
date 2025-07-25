class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor: " + this.name);
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
       super(name); // Step 1: Call parent constructor
        this.breed = breed;
        System.out.println("Dog Constructor: Breed is " + this.breed);
    }

    @Override
    void makeSound() {
        super.makeSound(); // Step 5: Call parent makeSound
        System.out.println("Dog barks"); // Step 6
    }

    void showDetails() {
        System.out.println("Dog Name: " + this.name); // Step 7
        System.out.println("Breed: " + this.breed);   // Step 8
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky", "Labrador"); // Step 0
        d.makeSound();                        // Step 4
        d.showDetails();                      // Step 7
    }
}
