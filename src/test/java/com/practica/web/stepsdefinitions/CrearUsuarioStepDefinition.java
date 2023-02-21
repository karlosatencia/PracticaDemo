package com.practica.web.stepsdefinitions;

import com.practica.web.models.Usuario;
import com.practica.web.questions.ValidarRegistro;
import com.practica.web.tasks.AbreWeb;
import com.practica.web.tasks.Registro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioStepDefinition {
    @Given("^que (.*) quiere crear un nuevo usuario$")
    public void queQuiereCrearUnNuevoUsuario(String actor) {
        theActorCalled(actor).wasAbleTo(AbreWeb.producStore());
    }

    @When("^ingrese sus datos correctamente$")
    public void ingreseSusDatosCorrectamente(List<Usuario> usuario) {
    theActorInTheSpotlight().attemptsTo(Registro.enLaPagina(usuario));
    }

    @Then("^debe ver product store en el home de la pagina$")
    public void debeVerProductStoreEnElHomeDeLaPagina() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRegistro.enHome()));
    }
}
