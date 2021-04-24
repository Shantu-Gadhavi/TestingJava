Feature: Add new user feature

  @addUser
  Scenario: Test Add new user
    Given go to website and login with username and password
    When verify that email is already exist
    And if email not exist add new user
    Then verify the user on list page