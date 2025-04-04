Feature: Login Feature

@set4
Scenario Outline: Login with valid and invalid login credentials
When User enters "<username>" and "<password>"
Then User session should be avaible

Examples:

|   username    |    password    |  message  |
| standard-user |  secret_sauce  |  Products |