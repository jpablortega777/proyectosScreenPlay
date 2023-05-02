package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;
import static userinterfaces.HomePage.txtEmail;

public class CrearCuentaMercadoLibre implements Task
{
    private String correo;

    public CrearCuentaMercadoLibre(String correo) {
        this.correo = correo;
    }

    public static CrearCuentaMercadoLibre crearCuenta(String correo)
    {
        return instrumented(CrearCuentaMercadoLibre.class,correo);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Click.on(btnCheckBox),
                TiempoEspera.unMomnto(1),
                Click.on(btnContinuar),
                TiempoEspera.unMomnto(1),
                Click.on(btnValidarEmail),
                TiempoEspera.unMomnto(1),
                Enter.theValue(correo).into(txtEmail)
        );
    }


}
