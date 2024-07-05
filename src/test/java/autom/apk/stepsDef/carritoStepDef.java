package autom.apk.stepsDef;

import autom.apk.steps.carritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class carritoStepDef {

    @Steps
    carritoSteps carrito;

    @Given("estoy en la aplicación de SauceLabs")
    public void validarIngresoApp() {
        carrito.validarIngreso();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void ValidarCatalogo() {
        carrito.validarCatalogo();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(String arg0) {
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }


}
