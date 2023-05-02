package task;

//import jdk.internal.org.jline.utils.ShutdownHooks;
import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class LinkCuentaMercadoLibre implements Task
{


    public LinkCuentaMercadoLibre() {

    }

    public static LinkCuentaMercadoLibre linkCrearCuenta()
    {
        return instrumented(LinkCuentaMercadoLibre.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor)
    {
        Actor.attemptsTo
                (
                Click.on(linkcuenta),
                TiempoEspera.unMomnto(1),
                Click.on(btnCookie)
        );
    }
}
