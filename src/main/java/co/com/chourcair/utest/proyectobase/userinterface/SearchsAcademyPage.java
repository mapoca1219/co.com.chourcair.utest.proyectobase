package co.com.chourcair.utest.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchsAcademyPage {

    public static final Target BUTTON_UC = Target.the("selecciona en Academy ")
            .located(By.xpath("//div[@id='Academy']//strong"));
    public static final Target INPTU_COURSE = Target.the("selecciona la busqueda de Utest")
            .located(By.id("searchInput"));
    public static final Target BUTTON_GO = Target.the("selecciona la Academy")
            .located(By.id("//button[@class='nav-sidebar-item__link nav-sidebar-item__link--selected']"));
    public static final Target SELECT_COURSE = Target.the("selecciona la universidad choucair")
            .located(By.xpath("//h4[contains(text(), 'Talks with Jeremiah')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Talks with Jeremiah')]"));
}
