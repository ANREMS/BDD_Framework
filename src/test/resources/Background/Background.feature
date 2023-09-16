Feature: Feature file for checking url and registration functionality
Background:
  Given As a User opens the browser
  Then As a user enters the url "https://www.smartbazaar.co.uk/" of the application

Scenario: As a user I want to check the functionality of the url

And As a user verify the Title of the application
Then As a user close the browser

Scenario: As a user I want to check the registration functionality

And As a user clicks on the login and registration button
And As a user tries to enter username '<username>'
And As a user enters the emailid '<email id>'
And As a user enters password  '<password>'
And As a user clicks on the register button
Then As a user close the browser
