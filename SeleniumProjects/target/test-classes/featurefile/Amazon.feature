Feature: Validate Searchpage
  @AmazonSearch
 Scenario Outline: Searchpage validation

   When user selects the dropdown option "<value>"
   And user enter the <"Searchvalue">
   And user clicks the search icon
   Then validate the corresponding result is displayed

   Examples:
     | value | Searchvalue |
     | Alexa Skills |colouring book for kids |

