public class IsInstanceOf {

    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }
}
/*
It's used like this: «object» instanceof «class»."

It checks whether an object is an instance of a particular class. It's easier than explaining it. Look at this example:

Object o = new Integer(3);
boolean isInt = o instanceof Integer;
isInt will be true. The object referenced by the variable o is an instance of the Integer class.
Object o = "Mama";
boolean isInt = o instanceof Integer;
isInt will be false. The object referenced by the variable o is not an instance of the Integer class. It is a String object.
InputStream is = new FileInputStream("");
boolean isFIS = is instanceof FileInputStream;
isFIS will be true. The object referenced by the variable o is an instance of the FileInputStream class.

class Animal
{
}
class Cat extends Animal
{
}
class Tiger extends Cat
{
}
Here we have three class declarations: Animal, Cat, and Tiger. Cat inherits Animal. And Tiger inherits Cat.
Object o = new Tiger();
boolean isCat = o instanceof Cat;
boolean isTiger = o instanceof Tiger;
boolean isAnimal = o instanceof Animal;
isCat will be true.
isTiger will be true.
isAnimal will be true.
Object o = new Animal();
boolean isCat = o instanceof Cat;
boolean isTiger = o instanceof Tiger;
boolean isAnimal = o instanceof Animal;
isCat will be false.
isTiger will be false.
isAnimal will be true.
And even interfaces:

Code	Description
interface Moveable
{
}
class Cat
{
}
class TomCat extends Cat implements Moveable
{
}
Create two classes: Cat, TomCat and the Moveable interface
Cat o = new TomCat();
boolean isCat = o instanceof Cat;
boolean isMoveable = o instanceof Moveable;
boolean isTom = o instanceof TomCat;
isCat will be true.
isMoveable will be true.
isTom will be true.
Cat o = new Cat();
boolean isCat = o instanceof Cat;
boolean isMoveable = o instanceof Moveable;
boolean isTom = o instanceof TomCat;
isCat will be true.
isMoveable will be false.
isTom will be false.
The instanceof operator looks like this: a instanceof B.

In other words, the instanceof operator will return true if:

1) variable a stores a reference to an object of type B

2) variable a stores a reference to an object whose class inherits B

3) variable a stores a reference to an object that implements interface B

Otherwise, the instanceof operator will return false.


 */