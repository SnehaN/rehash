public class TheMotivator 
{
	public void scorefeedback(int score)
	 {
		if (score == 100)
		{

			System.out.println("You're brilliant");
			upcomingEvents();
		}
		else if (score > 90)
		{
			System.out.println("That's great");
			upcomingEvents();
		}
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}

	public void upcomingEvents()
	{
		System.out.println("-----Upcoming Events-----");
		System.out.println("Lets meet at BJ's Restaurant!!!!");
	}


	public static void main(String[] args)
	 {
		TheMotivator tm = new TheMotivator();
		tm.scorefeedback(91);
		
	}
}