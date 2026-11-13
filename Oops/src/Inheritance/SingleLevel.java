package Inheritance;

class parent
{
	int netWorth=10000;	
}
class child extends parent
{
	void display()
	{
		System.out.println(netWorth);
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		
		child c=new child();
		c.display();
		

	}

}
