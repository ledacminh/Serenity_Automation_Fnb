@login01
Feature: Login to FnB Feature 2

  #Background:
   # Given Open Fnb system

  @tag02
  Scenario:  Login Successfully no parameter
    When Input to name store
    And Input to user name
    And Input to password
    And Click to button manage
   # And Close application

  #mvn clean verify -D.filter.tags="@tag01"

