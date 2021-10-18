package Up.and.down.casting;
class Animal 
{
	void eat()
	{
		System.out.println("Animals can eat....");
	}

}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Cats can meow.....");
	}
}
class Dog extends Animal
{
	void bark()
	{
	System.out.println("Dogs can bark.....");
	}
}
class Main
{
	public static void main(String args[])
	{
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		Animal animal = new Cat();
		animal.eat();
		Cat cat1 = (Cat) animal;
		cat.meow();
		cat.eat();
		
	}
}
