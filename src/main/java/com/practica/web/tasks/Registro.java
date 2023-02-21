package com.practica.web.tasks;

import com.practica.web.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.practica.web.userInterface.UIMenu.BTN_SIGNUP;
import static com.practica.web.userInterface.UIRegistro.*;

public class Registro implements Task {

    private List<Usuario> usuario;

    public Registro(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGNUP),
                Enter.theValue(usuario.get(0).getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.get(0).getClave()).into(TXT_CLAVE),
                Click.on(BTN_SIGNUP_MODAL)
        );
    }

    public static Registro enLaPagina(List<Usuario> usuario){
        return Tasks.instrumented(Registro.class,usuario);
    }
}
