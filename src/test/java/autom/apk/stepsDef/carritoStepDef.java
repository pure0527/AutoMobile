package autom.apk.stepsDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class carritoStepDef {
    @Given("^estoy en la aplicación de SauceLabs$")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("^valido que carguen correctamente los productos en la galeria$")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
    }

    @When("agrego <UNIDADES> del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(String arg0) {
    }

    @Then("^valido el carrito de compra actualice correctamente$")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }


}
