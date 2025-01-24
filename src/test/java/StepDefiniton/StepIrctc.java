package StepDefiniton;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.TicketBookingClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepIrctc extends BaseClass{
	
static TicketBookingClass tc;
	@Given("user should be on ticketBooking page in {string} browser")
	public void user_should_be_on_ticket_booking_page_in_browser(String Browser) throws IOException {
		
		BaseClass.initialization(Browser);
		
	}
@When("user should enter valid {string} as from")
public void user_should_enter_valid_as_from(String From) {
   
	 tc = new TicketBookingClass();
	 tc.enterFrom(From);
    
}
@When("user should enter valid {string} as to")
public void user_should_enter_valid_as_to(String To) {
   
	 tc = new TicketBookingClass();
	 tc.enterFrom(To); 
}


@When("user should enter valid {string} as month and {string} as Year")
public void user_should_enter_valid_as_month_and_as_year(String Month, String Year) {
   
	 tc = new TicketBookingClass();
	 tc.enterMonthAndYear(Month, Year);
    
}
@When("user shoould enter valid {string} as Date")
public void user_shoould_enter_valid_as_date(String Date) {
   
	 tc = new TicketBookingClass();
	 tc.enterDate(Date);
    
}

}
