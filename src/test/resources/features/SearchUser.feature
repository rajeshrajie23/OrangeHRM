Feature: Searching a user

  @Search  
  Scenario: verify user name appears in search
    Given launch the url
    Then verify the homepage is loaded
    When enter username as "Admin" and password as "admin123" and click on login
    Then verify the dashboard title
    When click on admin button
    Then vefiy the page title
    When enter username as "Admin"
    And click on user role dropdown
    And select user role as "Admin"
    And click on status button 
    And select status as "enabled"
    And click on search button 
