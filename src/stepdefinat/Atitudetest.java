package stepdefinat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Atitudetest {

	
	@When("I meet ([^\"]*)")
	public void Imeet(String str)
	{
		
		if(str.equals("watchmen"))
		{
			System.out.println("watchmen automation");
		}
		
		if(str.equals("Mornings"))
		{
			System.out.println("NewspaperBoy automation");
		}
	}
	
	@Given("I work ([^\"]*)")
	
	public void latnit(String str)
	{
		if(str.equals("Latenights"))
		{
			System.out.println("Latenite automation");
		}
		
		if(str.equals("Mornings"))
		{
			System.out.println("morning automation");
		}
	}
	
@Then("I ([^\"]*)")
	
	public void skipgreet(String str)
	{
	if(str.equals("Greeted"))
	{
		System.out.println("Greeted automation");
	}
	
	if(str.equals("skipGreeting"))
	{
		System.out.println("skipGreeting automation");
	}
	}
}
