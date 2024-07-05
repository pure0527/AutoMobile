package autom.apk.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyDemoLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement tituloApp;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private List<WebElement> lista2;


    public void esperarElemento(WebElement elemento){
        waitFor(ExpectedConditions.elementToBeClickable(elemento));
    }

    public int getCountElements(){
        //List<WebElement> lista = getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Item\"]"));
        return lista2.size();
    }

    //
    public String getTitulo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")));
        return tituloApp.getText();
    }
}
