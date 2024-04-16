package co.com.banitsmo.certificacion.pg.stepdefinitions;

import co.com.banitsmo.certifiacion.pg.questions.Validacion;
import co.com.banitsmo.certifiacion.pg.tasks.ValidaPDF;
import co.com.banitsmo.certifiacion.pg.utils.Chrome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PruebaStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());

    }

    @Given("^que el usuario este en la pagina Banistmo$")
    public void queElUsuarioEsteEnLaPaginaBanistmo() {
        OnStage.theActorCalled("usuario").can(BrowseTheWeb.with(Chrome.in().pruebaA()));

    }


    @When("^el usuario descargue el PDF$")
    public void elUsuarioDescargueElPDF() {

        theActorInTheSpotlight().attemptsTo(ValidaPDF.enter());

    }

    @Then("^el usuario ve el PDF sea correcto$")
    public void elUsuarioVeElPDFSeaCorrecto() {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validacion.ok()));
        }

    }








