package steps;

import com.sun.jna.platform.FileUtils;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class RealizarLoginSteps {

    private WebDriver driver;

    @Quando("acesso a página de login")
    public void acesso_a_página_de_login() {
        //Abrir o navegador
        driver = new ChromeDriver();
        //Acessar a página
        driver.get("https://login.solides.jobs/");
    }
    @Quando("informar email")
    public void informar_email() {
        driver.findElement(By.xpath("//*[contains(@name, 'user')]//..//..//input[contains(@type,'text')]")).sendKeys("flip.m.ferreira@gmail.com");
    }
    @Quando("informar a senha")
    public void informar_a_senha() {
        driver.findElement(By.xpath("//*[contains(@name, 'password')]//..//..//input[contains(@type,'password')]")).sendKeys("a123456");
    }
    @Quando("clicar no entrar")
    public void clicar_no_entrar() {
        driver.findElement(By.xpath("//*[contains(text(), 'Entrar')]//..//..//*[contains(@type,'submit')]")).click();
    }
    @Então("eu verifico se estou logado")
    public void eu_verifico_se_estou_logado() {
        Boolean m = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.xpath("//*[contains(text(), 'Editar currículo')]"),	"Editar currículo"));
        String texto = driver.findElement(By.xpath("//*[contains(text(), 'Editar currículo')]")).getText();
        Assert.assertEquals("Editar currículo", texto);
    }
}
