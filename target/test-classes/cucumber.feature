
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 
  @tag2
  Scenario Outline: to check customer id is displayed or not
    Given user is in guru telecom page and clicks add customer
    When user fills all the fields and clicks submit button "<fname>","<lastname>","<email>","<address>","<phno>"
    Then user verifies whether customer id is displayed

    Examples: 
      | fname  | lastname | email  | address| phno|
      | venkatesh |     sm | venkateshv6868@gmail.com |33 high school street theni|8526929857|
      | ram |     m | ram@gmail.com | theni|8667278584|
      
 
