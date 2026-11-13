package Inheritance;

import OOPS.grandparent;

class grandparents
{
	int netWorth=10000;
}
class parentss extends grandparent
{
	void display()
	{
		System.out.println(netWorth);
	}		
}
class childss extends grandparents
{
	void display()
	{
		System.out.println(netWorth);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		parentss p=new parentss();
		childs c=new childs();
		c.display();
		p.display();
		

	}

}
