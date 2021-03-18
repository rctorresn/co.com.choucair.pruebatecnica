package co.com.choucair.pruebatecnica.tasks;

import co.com.choucair.pruebatecnica.userinterface.UtestClickButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenUpRegister implements Task {
    public static OpenUpRegister thePage() {
        return Tasks.instrumented(OpenUpRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestClickButton.SELECT_MONTH),
                Click.on(UtestClickButton.SELECT_DAY),
                Click.on(UtestClickButton.SELECT_YEAR),

                Click.on(UtestClickButton.REGISTER_BUTTON));
    }
}
