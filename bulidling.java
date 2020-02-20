package epam.task41;

public class bulidling {
void bulid(String s,double s1) {
	if(s.equals("standard materials"))
	{
		System.out.println(1200*s1);
	}
	else if(s.equals("above standard materials"))
	{
		System.out.println(1500*s1);	
	}
	else if(s.equals("high standard materials"))
	{
		System.out.println(1800*s1);
	}
	else if(s.equals("high standard and fully automated"))
	{
		System.out.println(2500*s1);
	}
}
}