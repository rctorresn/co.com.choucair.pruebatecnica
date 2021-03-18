package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.UtestRegisterPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterPage2 implements Task {

    private String strMobile;
    private String strModel;
    private String strSystemOperating;


    public RegisterPage2(String strMobile, String strModel, String strSystemOperating) {
        this.strMobile = strMobile;
        strModel = strModel;
        this.strSystemOperating = strSystemOperating;
    }

    public static RegisterPage2 OnThePage(String strMobile, String strModel, String strSystemOperating) {
        return Tasks.instrumented(RegisterPage2.class, strMobile, strModel, strSystemOperating);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage2.INPUT_MOBILE),
        (Click.on(UtestRegisterPage2.INPUT_MODEL)),
        (Click.on(UtestRegisterPage2.INPUT_SYSTEMOPERATING)),
                (Click.on(UtestRegisterPage2.INPUT_NEXTLASTSTEP)));

    }
}
