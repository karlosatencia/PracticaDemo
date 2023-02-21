package com.practica.web.tasks;

import com.practica.web.userInterface.UIPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbreWeb implements Task {

    private UIPagina paginaProductStore;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaProductStore)
        );
    }

    public static AbreWeb producStore(){
        return Tasks.instrumented(AbreWeb.class);
    }
}
