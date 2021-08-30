package co.com.chourcair.utest.proyectobase.stepdefinitions;

import co.com.chourcair.utest.proyectobase.model.AcademyuTestData;
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

import java.util.List;


public class uTestAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Marco wants to learn automation in academia with Utest$")
    public void marcoWantsToLearnAutomationInAcademiaWithUtest(List<AcademyuTestData> academyuTestData) throws Exception {
        OnStage.theActorCalled("mapoca12@hotmail.es").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyuTestData.get(0).getStrUser(), academyuTestData.get(0).getStrPassword())));
  // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^searching for uTest platform login and course search$")
    public void searchingForUTestPlatformLoginAndCourseSearch(List<AcademyuTestData> academyuTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Searchs.the(academyuTestData.get(0).getStrCourse()));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^find the user and search for the course$")
    public void findTheUserAndSearchForTheCourse(List<AcademyuTestData> academyuTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyuTestData.get(0).getStrCourse())));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
