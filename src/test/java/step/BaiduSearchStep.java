package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class BaiduSearchStep extends AbstractStepDefs{

    @Given("open baidu")
    public void open() {
        driver.get("https://www.baidu.com");
    }

    @When("input {string}")
    public void input(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("kw")).sendKeys("Java");
    }

    @Then("show {string}")
    public void show(String arg0) throws InterruptedException {
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
    }
}
