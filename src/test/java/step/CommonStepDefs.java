package step;

import io.cucumber.java.en.Given;

/**
 * 用于初始化页面
 */
public class CommonStepDefs extends AbstractStepDefs {
    @Given("the Login page is opened")
    public void theLoginPageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

    }

    @Given("the home page is opened")
    public void theHomePageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");

    }

    @Given("the Cart page is opened")
    public void theCartPageIsOpened() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

}