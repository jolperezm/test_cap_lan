package seleniumcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Test extends testBase {

    @Given("^Como cliente ingreso a la url \"([^\"]*)\"$")
    public void como_cliente_ingreso_a_la_url(String arg1) throws Exception {
        paginaInicioPo.start();
    }

    @Given("^escojo la ruta de inicio$")
    public void escojo_la_ruta_de_inicio() throws Exception {
        paginaInicioPo.vueloIda();
    }


    @Given("^escojo la ruta de retorno$")
    public void escojo_la_ruta_de_retorno() throws Exception {
        paginaInicioPo.vDestino();
    }

    @Given("^escojo fecha ida$")
    public void escojo_fecha_ida() throws Exception {
        paginaInicioPo.fIda();
    }

    @Given("^escojo fecha retorno$")
    public void escojo_fecha_retorno() throws Exception {
        paginaInicioPo.fRetorno();
        paginaInicioPo.hInicioV();
        paginaInicioPo.hVuelta();
    }

    @Given("^escojo el asiento$")
    public void escojo_el_asiento() throws Exception {
        paginaInicioPo.sAsiento();
    }

    @Given("^ingresar pasajero$")
    public void ingresar_pasajero() throws Exception {
        paginaInicioPo.pasajeros();
    }

    @Then("^obtengo la ruta mas barata$")
    public void obtengo_la_ruta_mas_barata() throws Exception {
    }
}
