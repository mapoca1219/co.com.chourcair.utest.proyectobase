package co.com.chourcair.utest.proyectobase.stepdefinitions;

import co.com.chourcair.utest.proyectobase.tasks.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Marco wants to learn automation in academia with Utest$")
    public void marcoWantsToLearnAutomationInAcademiaWithUtest() throws Exception {
        OnStage.theActorCalled("mapoca12@hotmail.es").wasAbleTo(OpenUp.thePage());
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^searching for uTest platform login and course search$")
    public void searchingForUTestPlatformLoginAndCourseSearch() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^find the user and search for the course$")
    public void findTheUserAndSearchForTheCourse() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
