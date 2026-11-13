package Abstraction;

abstract class Bird {

	abstract void  eat();
	abstract void fly();
      }

abstract class Eagle extends Bird
{
	@Override
	void fly()
	{
		System.out.println("Eagle is fly");
	}
}

class SerpantsEagle extends Eagle
{
	@Override
	void eat()
	{
		System.out.println("serpantEagle  is eat eagle ");
	}
}
class GoldonEagle extends Eagle
{
	@Override
	void eat()
	{
		System.out.println("goldenEagle is eat eagle");
	}
}

public class Abstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eagle e=new GoldonEagle ();
		e.eat();
		e.fly();
	}

}

