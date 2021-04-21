package seleniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.PaginaInicioPo;

public class testBase {

    protected WebDriver driver = Hooks.getDriver();
    protected PaginaInicioPo paginaInicioPo = PageFactory.initElements(driver,PaginaInicioPo.class);

}
