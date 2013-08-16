Feature: Greeting

  Scenario: Say Hello to Me
    Given I have a greeter
    When the greeter greets "Me"
    Then I will see the following message:
    """
    Hello Me!
    """