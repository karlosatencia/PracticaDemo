package com.practica.web.stepsdefinitions;

import com.practica.web.tasks.AbreWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CrearUsuarioStepDefinition {
    @Given("^que (.*) quiere crear un nuevo usuario$")
    public void queQuiereCrearUnNuevoUsuario(String actor) {
        theActorCalled(actor).wasAbleTo(AbreWeb.producStore());
    }

    @When("^ingrese sus datos correctamente$")
    public void ingreseSusDatosCorrectamente() {

    }

    @Then("^debe ver product store en el home de la pagina$")
    public void debeVerProductStoreEnElHomeDeLaPagina() {

    }
}
