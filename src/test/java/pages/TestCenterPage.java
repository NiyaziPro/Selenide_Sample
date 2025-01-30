package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {

    public SelenideElement kullaniciAdi = $(By.id("exampleInputEmail1"));

    public SelenideElement kullaniciSifre = $(By.cssSelector("#exampleInputPassword1"));

    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

    public SelenideElement loginSuccessfully = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    public SelenideElement checkbox1 = $(By.id("box1"));

    public SelenideElement checkbox2 = $(By.id("box2"));

    public SelenideElement blue = $(By.id("blue"));
    public SelenideElement red = $(By.id("red"));
    public SelenideElement yellow = $(By.id("yellow"));
    public SelenideElement black = $(By.id("black"));
    public SelenideElement green = $(By.id("green"));

    public SelenideElement basketball = $(By.id("basketball"));
    public SelenideElement football = $(By.id("football"));
    public SelenideElement hockey = $(By.id("hockey"));
    public SelenideElement waterPolo = $(By.id("water_polo"));


    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));
}

