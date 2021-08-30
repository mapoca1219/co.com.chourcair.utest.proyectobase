package co.com.chourcair.utest.proyectobase.tasks;

import co.com.chourcair.utest.proyectobase.userinterface.SearchsAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Searchs implements Task {


    private String course;

    public static Searchs the(String course) {
        return Tasks.instrumented(Searchs.class);
    }

    public Searchs(String course) {
        this.course = course;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchsAcademyPage.BUTTON_UC),
                Enter.theValue(course).into(SearchsAcademyPage.INPTU_COURSE),
                Click.on(SearchsAcademyPage.BUTTON_GO),
                Click.on(SearchsAcademyPage.SELECT_COURSE)
        );
    }
}
