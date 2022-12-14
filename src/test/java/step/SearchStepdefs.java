package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SearchStepdefs extends AbstractStepDefs{
    @Given("user Search")
    public void userSearch() {
        driver.get("https://ultimateqa.com/");
    }

    @When("user Search title is {string}")
    public void userSearchTitleIs(String arg0) {
        //get search field
        driver.findElement(By.xpath("//*[@id=\"post-217173\"]" +
                "/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[1]")).sendKeys(arg0);

    }

    @Then("Search should be successful")
    public void searchShouldBeSuccessful() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"post-217173\"]" +
                "/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[5]")).click();
        Thread.sleep(2000);
    }
}
