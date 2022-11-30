package step;

import inf.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ForgetStepdefs extends AbstractStepDefs{
    @Given("users login to saucedemo")
    public void usersLoginToSaucedemo() {
        driver.get("https://phptravels.net/api/admin");
    }

    @When("users enter Username as {string} and Password as {string}")
    public void usersEnterUsernameAsAndPasswordAs(String arg0, String arg1) throws InterruptedException {
        driver.findElement(By.xpath(LoginPage.getUSERNAME())).sendKeys(arg0);
        driver.findElement(By.xpath(LoginPage.getPASSWORD())).sendKeys(arg1);
        driver.findElement(By.xpath(LoginPage.getRemberContent())).click();
        Thread.sleep(1000);

    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        //点击跳转
        driver.findElement(By.xpath(LoginPage.getLOGIN())).click();
        //由于账号密码错误，所以判断是一定出错的
        if(driver.getCurrentUrl().equalsIgnoreCase("https://phptravels.net/api/admin")){
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Test Failed");
        }
    }

    @Given("user forget password when login")
    public void userForgetPasswordWhenLogin() {
        //跳转浏览器到登录页面
        driver.get("https://phptravels.net/api/admin");
    }

    @When("user click Forget Password and Email Address is {string}")
    public void userClickForgetPasswordAndEmailAddressIs(String arg0) {
        //点击Forget Password
        driver.findElement(By.id("link-forgot")).click();

        //输入email
        driver.findElement(By.id("resetemail")).sendKeys(arg0);

        // 点击提交
        driver.findElement(By.xpath("//*[@id=\"btn-forgot\"]/span[1]")).click();

    }

    @Then("Recover the password should be unsuccessful")
    public void recoverThePasswordShouldBeUnsuccessful() {
        if(driver.findElement(By.xpath("//*[@id=\"passresetfrm\"]/div[1]/div")).getText().
                equals("New Password sent to admin@phptravels.com, Kindly check email.")){
            System.out.println("Recover the password  be successful");
        }else {
            System.out.println("Fail");
        }
    }
}
