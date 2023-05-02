package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BuscarProductoPage.*;

public class BuscarProductoMercadoLibre implements Task
{
    private String producto;

    public BuscarProductoMercadoLibre(String producto) {
        this.producto = producto;
    }

    public static BuscarProductoMercadoLibre buscarProducto(String producto)
    {
        return instrumented(BuscarProductoMercadoLibre.class,producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(btnCookie2),
                TiempoEspera.unMomnto(1),
                Enter.theValue(producto).into(txtBusqueda),
                Click.on(btnLupa),
                TiempoEspera.unMomnto(1),
                Click.on(closeUbicacion),
                TiempoEspera.unMomnto(1),
                Click.on(linkProducto),
                TiempoEspera.unMomnto(1),
                Click.on(btnAddCarrito),
                TiempoEspera.unMomnto(1),
                Click.on(btnCrearcuenta)

        );
    }
}
