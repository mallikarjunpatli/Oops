package Inheritance;
class grandparent1
{
	int netWorth=10000;
}
class parent1 extends grandparent1
{
		
}
class child1 extends parent1
{
	void display()
	{
		System.out.println(netWorth);
	}
}
class child2 extends parent1
{
	
}
public class Hybride {

	public static void main(String[] args) {
		
		childs c=new childs();
		c.display();
		child1 c1=new child1();
		c1.display();
		

	}

}


