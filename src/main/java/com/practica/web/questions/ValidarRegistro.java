package com.practica.web.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.practica.web.userInterface.UIMenu.LBL_NOMBRE_PAGINA;

public class ValidarRegistro implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_NOMBRE_PAGINA.resolveFor(actor).isVisible();
    }
    public static ValidarRegistro enHome(){
        return new ValidarRegistro();
    }
}
