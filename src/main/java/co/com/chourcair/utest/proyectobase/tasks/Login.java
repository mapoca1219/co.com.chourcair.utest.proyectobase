package co.com.chourcair.utest.proyectobase.tasks;

import co.com.chourcair.utest.proyectobase.userinterface.uTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON),
                Enter.theValue("IngresaTuUsuario").into(uTestLoginPage.INPUT_USER),
                Enter.theValue("IngresarContraseña").into(uTestLoginPage.INPUT_PASSWORD),
                Click.on(uTestLoginPage.INPUT_BUTTON)
        );
    }
}
