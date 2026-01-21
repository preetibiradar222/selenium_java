Feature: Application Login

Scenario:Admin Page Default Login


Given User is on NetBanking landing page
When User Login into application with "Admin" and "1234"
Then Home page is displayed
And Cards are displayed


Scenario:Admin User Default Login


Given User is on NetBanking landing page
When User Login into application with "Admin1" and "12345"
Then Home page is displayed
And Cards are displayed