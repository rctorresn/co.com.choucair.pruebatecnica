package co.com.choucair.pruebatecnica.stepdefinitions;

import co.com.choucair.pruebatecnica.model.UserInformation;
import co.com.choucair.pruebatecnica.tasks.OpenUp;
import co.com.choucair.pruebatecnica.tasks.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Camilo wants to register in Utest$")
    public void camilo_wants_to_register_in_Utest(List<UserInformation> userInformation) throws Exception {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage(),RegisterPage.OnThePage(userInformation.get(0).getStrFirstName(),userInformation.get(0).getStrLastName(),userInformation.get(0).getStrEmail()));

    }

    @When("^we proceed to register our location, we proceed to register our devices$")
    public void we_proceed_to_register_our_location_we_proceed_to_register_our_devices(DataTable arg1) {


    }

    @Then("^we finally create a key$")
    public void we_finally_create_a_key(DataTable arg1) {

    }

}
