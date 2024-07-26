package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class LoginSteps {

    @Before
    public void set_the_stage() {
        setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Given("{actor} login with {string} and {string}")
    public void actor_login_with_username_and_password(Actor actor, String username, String password) {
        actor.attemptsTo(Open.browserOn().the(LoginPage.class),
                Enter.theValue(username).into(LoginPage.USERNAME_TEXTBOX),
                Enter.theValue(password).into(LoginPage.PASSWORD_TEXTBOX),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    @When("{actor} enters open Trade Finance page")
    public void heEntersOpenTradeFinancePage(Actor actor) {

    }

    @And("{actor} fill the form with right data")
    public void heFillTheFormWithRightData(Actor actor) {
    }

    @Then("{actor} should be able to create a new LC")
    public void heShouldBeAbleToCreateANewLC(Actor actor) {
    }
}
