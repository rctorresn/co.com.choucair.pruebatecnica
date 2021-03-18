package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterPage implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public RegisterPage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }


    public static RegisterPage OnThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear){
        return Tasks.instrumented(RegisterPage.class, strFirstName, strLastName, strEmail, strMonth, strDay, strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                Click.on(UtestRegisterPage.INPUT_MONTH),SelectFromOptions.byValue(strMonth).from(UtestRegisterPage.INPUT_MONTH),
                Click.on(UtestRegisterPage.INPUT_DAY),
                Click.on(UtestRegisterPage.INPUT_YEAR),
                Click.on(UtestRegisterPage.ENTER_BUTTON)
                );
    }
}
