# Marco Polo

  @stories
  Feature: Academy uTest
    As a user, we are going to enter the uTest for the technical challenge

    @scenario1
    Scenario Outline: User search
      Given Marco wants to learn automation in academia with Utest
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When searching for uTest platform login and course search
        | atrCourse  |
        | <strCourse |
      Then find the user and search for the course
        | strCourse   |
        | <strCourse> |
      Examples:
        | StrUser             | strPassword   | strCourse              |
        | mapoca12@hotmail.es | Choucair2021* | Multimedia Bancolombia |
