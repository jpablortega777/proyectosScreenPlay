package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import task.ToolsQAAlertsTask;
import task.ToolsQAHomeTask;
import userinterfaces.ToolsQAHomePage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class toolQaAlertsStep
{
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor = Actor.named("Usuario");
    //INSTANCIAR LA CLASE HOMEPAGE
    private ToolsQAHomePage toolsQAHomePage= new ToolsQAHomePage();

    @Dado("el usuario ingresa a la opcion Alerts para usar las funciones")
    public void el_usuario_ingresa_a_la_opcion_alerts_para_usar_las_funciones() {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        // EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(toolsQAHomePage));
        //MAXIMIZAR LA PAGINA
        getDriver().manage().window().maximize();
        actor.wasAbleTo(ToolsQAHomeTask.Alerts());
    }
    @Cuando("el usuario use las {int} alertas de la opcion alertas")
    public void el_usuario_use_las_alertas_de_la_opcion_alertas(Integer int1, io.cucumber.datatable.DataTable dataTable) {


    }
    @Entonces("se comprobara las funciones de alertas en la pagina ToolsQA")
    public void se_comprobara_las_funciones_de_alertas_en_la_pagina_tools_qa() {

    }
}
