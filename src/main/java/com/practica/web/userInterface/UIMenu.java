package com.practica.web.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIMenu {
    public static final Target BTN_SIGNUP = Target.the("Boton SignUp").located(By.id("signin2"));
    public static final Target LBL_NOMBRE_PAGINA = Target.the("Nombre Pagina").located(By.xpath("//a[@id='nava']"));
}
