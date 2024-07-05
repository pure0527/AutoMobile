package autom.apk.steps;

import autom.apk.screens.MyDemoLoginScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class carritoSteps extends PageObject{

    MyDemoLoginScreen app;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement title;


    public void validarIngreso() {
        Assert.assertEquals("Products",app.getTitulo() );
    }

    public void validarCatalogo() {
        Assert.assertTrue(app.getCountElements()>1);
    }
}
