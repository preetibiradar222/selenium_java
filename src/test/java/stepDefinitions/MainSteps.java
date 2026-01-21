package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User is on NetBanking landing page");
		 System.out.println("User is on NetBanking landing page");
		 System.out.println("User is on NetBanking landing page");
	   
	   
	}
	@When("User Login into application with {string} and {string}")
	public void user_login_into_application_with_and(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(Username +"Password" +Password);
		
		
	    
	  
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("ome page is displaye");
	 
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("ards are displaye");
	    

	}
}



