Feature: Greeting 2

  Scenario: Say Hello to Someone
    Given I have a greeter
    When the greeter greets to "Someone"
    Then I will see the following message:
    """
    Hello Someone!
    """