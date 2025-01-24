Feature: IRCTC Application Test

  Scenario: Validate TicketBooking functionality
    Given user should be on ticketBooking page in "chrome" browser
    When user should enter valid "PUNE" as from
    And user should enter valid "MUMBAI" as to

  Scenario: Validate Calender Functionality
    When user should enter valid "February" as month and "2025" as Year
    And user shoould enter valid "10" as Date
