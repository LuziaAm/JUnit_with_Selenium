package codigo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeuBarriga {

    @Test
    public void deveSalvarComSucesso(){
        //***Arranje
        System.setProperty("webdriver.chrome.driver", "apps/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");

        driver.findElement(By.id("email")).sendKeys("a@a");
        driver.findElement(By.id("senha")).sendKeys("a");
        driver.findElement(By.tagName(("button"))).click();
        //driver.findElement(By.xpath(("//button"))).click();

        //***Act
        driver.findElement(By.linkText("Contas")).click();
        driver.findElement(By.linkText("Adicionar")).click();
        driver.findElement(By.id("nome")).sendKeys("Conta de teste2");
        driver.findElement(By.tagName(("button"))).click();

        //***Assert
        String resultado = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        Assert.assertEquals("Conta adicionada com sucesso!", resultado);

    }

}