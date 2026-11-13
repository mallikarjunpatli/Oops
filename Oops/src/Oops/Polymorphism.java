package Oops;
class plane
{
	void takeOff()
	{
		System.out.println("plan will land");
	}
	void fly()
	{
		System.out.println("plan will flies");
	}

}
class cargoPlane extends plane
{
	@Override
	void fly()
	{
		System.out.println("cargo plan  flies at lower hiegth");
	}
	void carryCargoPlan()
	{
		System.out.println("cargoPlan carry goods");
	}
}
class passengerPlane extends plane
{
	@Override
	void fly()
	{
		System.out.println("passenger plan flies at medium hieght");
	}
	void carryPassengerPlan()
	{
		System.out.println("passengerPlan carry pepole");
	}
}
class figtherPlane extends plane
{
	@Override
	void fly()
	{
		System.out.println("figther plan flies at any hieght");
	}
	void carryFigtherPlan()
	{
		System.out.println("figtherPlan carry weapon");
	}
}
class Airport
{
	void permit(plane ref)
	{
		ref.fly();
		ref.takeOff();
		if(ref instanceof cargoPlane)
		{
		((cargoPlane)(ref)).carryCargoPlan();
		}
		else if(ref instanceof passengerPlane)
		{
		((passengerPlane)(ref)).carryPassengerPlan();
		}
		else if(ref instanceof figtherPlane)
		{
			((figtherPlane)(ref)).carryFigtherPlan();	
		}
		
		
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plane ref;
		cargoPlane c=new cargoPlane();
		passengerPlane p=new passengerPlane();
		figtherPlane f=new figtherPlane();

		/*ref=c;
		ref.fly();
		ref.takeOff();
		((cargoPlane)(ref)).carryCargoPlan();

		ref=p;
		ref.fly();
		ref.takeOff();
		((passengerPlane)(ref)).carryPassengerPlan();

		ref=f;
		ref.fly();
		ref.takeOff();
		((figtherPlane)(ref)).carryFigtherPlan();
		*/
		
		Airport a=new Airport();
		a.permit(c);
		a.permit(p);
		a.permit(f);

		// we achieved the polymarphism but we have  achieved advange of polymarphism

	}

}


