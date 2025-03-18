package polymorphism;

public class Mainclass {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = new Dog();

        animal.makeSound(); // dog method will print

        //method is overridden,
        // Even though type reference is animal,
        // here run time object is dog so dog related method will be called.

        animal.sit(123);// animal method will print

        //method is overloading, here type reference is animal, run time object is dog.
        // In case of overloading, only type reference will be considered, so animal method will be called.

        dog.sit(123); // dog method will print
        dog.makeSound(); // dog method will print

        //here both run time object and type refence are same dog related. so obviously dog method will be called.

        dog.sit(123.04f);

        //Here type reference is dog and run time also dog. But dog does not have float variant of sit method.
        // Since polymorphism.Animal and dog are parent and child classes. dog class inherits parent's float variant sit method.

    }
}
