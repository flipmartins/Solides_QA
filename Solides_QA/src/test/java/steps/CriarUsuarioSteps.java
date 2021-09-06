package steps;

import com.sun.jna.platform.FileUtils;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CriarUsuarioSteps {

    private WebDriver driver;

    @Quando("acessar a página")
    public void acessar_a_página() {
        //Abrir o navegador
        driver = new ChromeDriver();
        //Acessar a página
        driver.get("https://login.solides.jobs/");
    }

    @Quando("clicar no link Registre-se")
    public void clicar_no_link_registre_se() {
        driver.findElement(By.linkText("Registre-se")).click();
    }

    @Quando("preencher o campo email")
    public void preencher_o_campo_email() {
        driver.findElement(By.xpath("//label[contains(text(), 'E-mail')]//..//..//*[contains(@type,'text')]")).sendKeys("flip.m.ferreira@gmail.com");
    }
    @Quando("preencher o campo CPF")
    public void preencher_o_campo_cpf() {
        driver.findElement(By.xpath("//label[contains(text(), 'CPF')]//..//..//*[contains(@type,'text')]")).sendKeys("014.353.441-62");
    }
    @Quando("preencher o campo Senha")
    public void preencher_o_campo_senha() {
        driver.findElement(By.xpath("//*[contains(@name, 'password')]//..//..//input[contains(@type,'password')]")).sendKeys("a123456");
    }
    @Quando("preencher o campo Repetir Senha")
    public void preencher_o_campo_repetir_senha() {
        driver.findElement(By.xpath("//label[contains(text(), 'Repetir Senha')]//..//..//input[contains(@type,'password')]")).sendKeys("a123456");
    }
    @Quando("clicar no checkbox para concordar com os termos de uso")
    public void clicar_no_checkbox_para_concordar_com_os_termos_de_uso() {
        driver.findElement(By.className("pure-material-checkbox")).click();
    }
    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_cadastrar() {
        driver.findElement(By.xpath("//*[contains(text(), 'CADASTRAR')]")).click();
    }
    @Então("eu verifico se fui cadastrado com sucesso")
    public void eu_verifico_se_fui_cadastrado_com_sucesso() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://solides.jobs/curriculum", url);
    }

}
