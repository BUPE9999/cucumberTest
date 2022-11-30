package step;

import io.cucumber.java.en.Given;

/**
 * 用于初始化页面
 */
public class CommonStepDefs extends AbstractStepDefs {

    //打开登录页面
    @Given("the Login page is opened")
    public void theLoginPageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

    }

    //打开商品页面
    @Given("the home page is opened")
    public void theHomePageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");

    }

    //打开购物车页面
    @Given("the Cart page is opened")
    public void theCartPageIsOpened() {
        driver.get("https://www.saucedemo.com/cart.html");
    }





}