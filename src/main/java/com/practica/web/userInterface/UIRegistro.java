package com.practica.web.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIRegistro {
    public static final Target TXT_USUARIO = Target.the("Txt usuario").located(By.id("sign-username"));
    public static final Target TXT_CLAVE = Target.the("Txt clave").located(By.id("sign-password"));
    public static final Target BTN_SIGNUP_MODAL = Target.the("Boton SignUp Modal").located(By.xpath("//button[contains(text(),'Sign up')]"));
}
