package co.com.chourcair.utest.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class uTestLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the from to login")
            .located(By.xpath("//div[@class= 'd-none d-lg-block']//strong[contains(text(),'Sign in to uTest')]"));

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("Username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'auth-section')]"));
}
