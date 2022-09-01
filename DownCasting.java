public class DownCasting {
}

/*
Because a class contains all member methods of the class it inherits,
an instance of the class can be saved in a variable whose type is that of any of its parents.

class Animal
{
public void doAnimalActions();
}class Cat extends Animal
{
public void doCatActions();
}class Tiger extends Cat
{
public void doTigerActions();
}
Here we have three class declarations: Animal, Cat, and Tiger. Cat inherits Animal. And Tiger inherits Cat.
public static void main(String[] args)
{
Tiger tiger = new Tiger();
Cat cat = new Tiger();
Animal animal = new Tiger();
Object obj = new Tiger();
}
A Tiger object can always be assigned to a variable whose type is that of one of its ancestors. For the Tiger class, these are Cat, Animal, and Object.
Now let's take a look at widening and narrowing conversions.

If an assignment operation causes us to move up the inheritance chain (toward the Object class), then we're dealing with a widening conversion (also known as upcasting). If we move down the chain toward the object's type, then it's a narrowing conversion (also known as downcasting).

Moving up the inheritance chain is called widening, because it leads to a more general type. However, in doing so we lose the ability to invoke the methods added to the class through inheritance.

Code	Description
public static void main(String[] args)
{
Object obj = new Tiger();
Animal animal = (Animal) obj;
Cat cat = (Cat) obj;
Tiger tiger = (Tiger) animal;
Tiger tiger2 = (Tiger) cat;
}
When narrowing the type, you need to use a type conversion operator, i.e. we perform an explicit conversion.
This causes the Java machine to check whether the object really inherits the type we want to convert it to.

This small innovation produced a manifold reduction in the number of type casting errors,
and significantly increased the stability of Java programs.

public static void main(String[] args)
{
Object obj = new Tiger();
if (obj instanceof Cat)
{
Cat cat = (Cat) obj;
cat.doCatActions();
}}
Better yet, use an instanceof check
public static void main(String[] args)
{
Animal animal = new Tiger();
doAllAction(animal);

Animal animal2 = new Cat();
doAllAction(animal2);

Animal animal3 = new Animal();
doAllAction(animal3);
}

public static void doAllAction(Animal animal)
{
if (animal instanceof Tiger)
{
Tiger tiger = (Tiger) animal;
tiger.doTigerActions();
}

if (animal instanceof Cat)
{
Cat cat = (Cat) animal;
cat.doCatActions();
}

animal.doAnimalActions();
}
And here's why. Take a look at the example on the left.
We (our code) don't always know what type of object we are working with. It could be an object of the same type as the variable (Animal), or any descendant type (Cat, Tiger).

Consider the doAllAction method. It works correctly, regardless of the type of object passed in.

In other words, it works correctly for all three types: Animal, Cat, and Tiger.

public static void main(String[] args)
{
Cat cat = new Tiger();
Animal animal = cat;
Object obj = cat;
}
Here we have three assignment operations. All of them are examples of widening conversions.
The type cast operator is not needed here, because no check is necessary. An object reference can always be stored in a variable whose type is one of its ancestors.

"Oh, the second to last example made everything clear: why the check is needed, and why type casting is needed."

"I hope so. I want to draw your attention to this fact:"

None of this causes an object to change in any way! The only thing that changes is the number of methods available to be called on a particular reference variable.

For example, a Cat variable lets you call the doAnimalActions and doCatActions methods. It doesn't know anything about the doTigerActions method, even if it points to a Tiger object.

 */