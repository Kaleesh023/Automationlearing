Feature: Alert page validation

  @LearnAlert
  Scenario: Validate
    Given user clicks the confirm box button
    When user extract the confirm box text
    And user clicks on the Cancel button
    Then user validtae the UI error message
