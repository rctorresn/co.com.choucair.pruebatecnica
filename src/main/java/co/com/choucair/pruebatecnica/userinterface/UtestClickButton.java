package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestClickButton extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Button that shows us the form to register").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target SELECT_MONTH = Target.the("Click to select month").located(By.xpath("//*[@id=/'birthMonth/']"));
    public static final Target SELECT_DAY = Target.the("click to select the dayBirth").located(By.xpath("//*[@id=/'birthDay/']"));
    public static final Target SELECT_YEAR = Target.the("Click to select the year").located(By.xpath("//*[@id=/'birthYear/']"));
}
