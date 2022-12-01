package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Arrays;

public class MessageStepdefs extends  AbstractStepDefs{
    @Given("user Test")
    public void userTest() {
        driver.get("https://ultimateqa.com/complicated-page");
    }

    @When("the Name as {string}  and Email Address as {string} and the {string} as message")
    public void theNameAsAndEmailAddressAsAndTheAsMessage(String arg0, String arg1, String arg2) throws InterruptedException {
        driver.findElement(By.id("et_pb_contact_name_0")).sendKeys(arg0);
        driver.findElement(By.id("et_pb_contact_email_0")).sendKeys(arg1);
        driver.findElement(By.id("et_pb_contact_message_0")).sendKeys(arg2);

        String arg = driver.findElement
                (By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/div/p/span"))
                .getText();

        //split the string to 2 part by "+"
        String[] xarr = arg.split(" \\+ ");

        //put elements to int array to operate
        int[] values = Arrays.stream(xarr)
                .mapToInt(Integer::parseInt)
                .toArray();

        int a = values[1];
        int b = values[0];

        int sum = a+b;
        String ans = String.valueOf(sum);

        driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/div/p/input"))
                .sendKeys(ans);
        Thread.sleep(1000);
    }

    @Then("submit button clicked")
    public void submitButtonClicked() {
        driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")).click();
    }
}
