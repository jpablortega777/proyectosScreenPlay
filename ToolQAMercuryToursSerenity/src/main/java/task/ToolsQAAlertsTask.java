package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ToolsQAHomePage.btnAlertasFrame;

public class ToolsQAAlertsTask implements Task
{
    public static ToolsQAAlertsTask Alerts()
    {
        return instrumented(ToolsQAAlertsTask                                                                                 .class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor)
    {
        Actor.attemptsTo
                (
                        Click.on(btnAlertasFrame),
                        TiempoEspera.unMomnto(1)

                );
    }
}
