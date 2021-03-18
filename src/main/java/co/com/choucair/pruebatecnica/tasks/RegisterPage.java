package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterPage implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    public RegisterPage(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static RegisterPage OnThePage(String strFirstName, String strLastName, String strEmail){
        return Tasks.instrumented(RegisterPage.class, strFirstName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL));
    }
}
