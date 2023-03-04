Feature: HomePage for Apollo247
  I want to test the Homepage functionality
  
 Background: user is on the Apollo homepage
  
  Scenario: Successful login with valid credentials
    Given user on the Apollo247 home page
    And user clicks on login button
    When user is able to give mobile number
    And user is able to write OTP
    Then user is able to login to see with name
  
  Scenario: Navigate to Book Appointment
    Given user is on the Apollo247 homepage
    When user is able to click on Book appointment with Apollo Doctors
    Then user is able to navigate to online consultation page
     
  Scenario: Navigates the Buy mediciens
    Given user is on the Apollo247 homepage
    When user is able to click on buy medicines and essentials button
    Then user is able to navigate to pharmacy page
    
  Scenario: Navigates the Book lab test
    Given user is on the Apollo247 homepage
    When user is able to click on Book lab tests button
    Then user is able to navigate to lab tests page
    
  Scenario: User visits the health records
    Given user is on the Apollo247 homepage
    When user is able to click view health records button
    Then user is able to navigate to health records page
    
  Scenario Outline: Login to Apollo247
    Given user on the Login page of Apollo247
    When user enter a valid mobile number and OTP
    And user click the submit button
    Then user should be redirected to the homepage of Apollo247
    And user should see a welcome message with my name
    
    Examples:
    mobilenumber
    |6281811022|
