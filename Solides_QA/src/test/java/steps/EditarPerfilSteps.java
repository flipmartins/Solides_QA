package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditarPerfilSteps {

    private WebDriver driver;

    @Dado("que acessei a página inicial")
    public void que_acessei_a_página_inicial() {
        //Abrir o navegador
        driver = new ChromeDriver();
        //Acessar a página
        driver.get("https://login.solides.jobs/");
    }
    @Quando("informo o email")
    public void informo_o_email() {
        driver.findElement(By.xpath("//*[contains(@name, 'user')]//..//..//input[contains(@type,'text')]")).sendKeys("flip.m.ferreira@gmail.com");
    }

    @Quando("informo a senha")
    public void informo_o_email() {
        driver.findElement(By.xpath("//*[contains(@name, 'password')]//..//..//input[contains(@type,'password')]")).sendKeys("a123456");
    }
    @Quando("clico em Entrar")
    public void clico_em_entrar() {
        driver.findElement(By.xpath("//*[contains(text(), 'Entrar')]//..//..//*[contains(@type,'submit')]")).click();
    }
    @Então("visualizo a página do usuario")
    public void visualizo_a_página_do_usuario() {
        Boolean m = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBe(By.xpath("//*[contains(text(), 'Editar currículo')]"),	"Editar currículo"));
        String texto = driver.findElement(By.xpath("//*[contains(text(), 'Editar currículo')]")).getText();
        Assert.assertEquals("Editar currículo", texto);
    }
    @Quando("preencho o campo telefone")
    public void preencho_o_campo_telefone() {
        driver.findElement(By.xpath("//*[contains(@name, 'password')]//..//..//input[contains(@type,'password')]")).sendKeys("a123456");
    }

}
