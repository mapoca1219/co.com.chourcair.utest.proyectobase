package co.com.chourcair.utest.proyectobase.stepdefinitions;

import co.com.chourcair.utest.proyectobase.questions.Answer;
import co.com.chourcair.utest.proyectobase.tasks.Login;
import co.com.chourcair.utest.proyectobase.tasks.OpenUp;
import co.com.chourcair.utest.proyectobase.tasks.Searchs;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class uTestAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Marco wants to learn automation in academia with Utest$")
    public void marcoWantsToLearnAutomationInAcademiaWithUtest() throws Exception {
        OnStage.theActorCalled("mapoca12@hotmail.es").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^searching for uTest platform login and course search$")
    public void searchingForUTestPlatformLoginAndCourseSearch(String course) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Searchs.the(course));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^find the user and search for the course$")
    public void findTheUserAndSearchForTheCourse(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
