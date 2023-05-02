package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToBy;

import static userinterfaces.ToolsQAHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ToolsQAHomeTask implements Task
{

    public static ToolsQAHomeTask Alerts()
    {
        return instrumented(ToolsQAHomeTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor)
    {
        Actor.attemptsTo
                (
                        Scroll.to(btnAlertasFrame),
                        TiempoEspera.unMomnto(1),
                        Click.on(btnAlertasFrame)

                );
    }
}
