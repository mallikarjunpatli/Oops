package Oops;

public class Encapsulation {

	private int bal=23234;

	public void setter(int x)
	{
		bal=x;
	}

	public int getter()
	{
		return bal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setter(2323);

		System.out.println(e.getter());






	}

}
