#Autor: Ramses Camilo Torres

  @stories
  Feature: Register UTest
    As a new tester, he want to learn new skills while helping world-class companies deliver amazing digital experiences.
  @scenario1
  Scenario: register new user information
    Given Camilo wants to register in Utest
    |strFirstName | strLastName | strEmail         | strMonth | strDay | strYear |
    |Ramses       | Torres      |rammsest@gmail.com| October  | 6      |1991  |
    When we proceed to register our location, we proceed to register our devices
    |strCity|strMobile  |strModel |strSystemOperating|
    |Bogota   |Huawei     |P20 lite |Android 9.0 (Pie) |

    Then we finally create a key
    |strPassword  |strCheckPassword|
    |Torres1006*  |Torres1006*     |
