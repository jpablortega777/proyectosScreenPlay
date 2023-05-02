package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")

public class ToolsQAHomePage extends PageObject
{
    //ELEMENTO MAPEADOS DE LA WEB TOOLS QA
    public static final Target btnAlertasFrame = Target.the("Boton Alertas pageHome ToolsQA").locatedBy("//div[@class='category-cards']//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");

}
