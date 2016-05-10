#@CRMLoginPage_2
#Feature:
#  User wants to be logged in CRM System use and make operations in account page
#
#  Background:
#    Given the user is on CRMLoginPage
#
#  @possitive
#  Scenario Outline: user decides to login having e-mail and password
#    When user logins entering email as <email> and password as <password>
#    Then user should see MyAccountPage
#    Examples:
#      |email|password|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|
#
#  @forgotPassword
#  Scenario Outline: user decides to login having e-mail and password
#    When user logins entering email as <email> and password as <password>
#    Then user should see MyAccountPage
#    Examples:
#      |email|password|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|
#      |alexanderiv@123software.ru|123software.ru|