package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

/**
 * 百度搜索，作为测试场景
 */
public class BaiduSearchStep extends AbstractStepDefs{

    @Given("打开百度搜索")
    public void open() {
        driver.get("https://www.baidu.com");
    }

    @When("输入{string}")
    public void input(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("kw")).sendKeys("Java");
    }

    @Then("跳转到{string}")
    public void show(String arg0) throws InterruptedException {
        //通过百度的提交id定位点击
        driver.findElement(By.id("su")).click();
        //强制暂停，一个场景结束调用一次，便于观察
        Thread.sleep(2000);
    }
}
