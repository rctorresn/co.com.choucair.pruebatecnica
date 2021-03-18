package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage2 extends PageObject {

    public static Target INPUT_MOBILE = Target.the("select a mobile").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]"));
    public static Target INPUT_MODEL = Target.the("select a Model mobile").located(By.xpath("//*[@id=/'mobile-device/']/div[2]/div[2]/div/div[1]"));
    public static Target INPUT_SYSTEMOPERATING = Target.the("Select operating system").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div"));
    public static Target INPUT_NEXTLASTSTEP = Target.the("Button next page").located(By.xpath("//*[@id=/'regs_container/']/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
