package step_definitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertTrue;

public class TestCenterStepDefinitions {

    TestCenterPage testCenterPage = new TestCenterPage();

    @And("kullanici adini gir")
    public void kullaniciAdiniGir() {
        testCenterPage.kullaniciAdi.setValue("techproed");
    }

    @And("kullanici sifresini gir")
    public void kullaniciSifresiniGir() {
        testCenterPage.kullaniciSifre.setValue("SuperSecretPassword");
    }

    @When("submit butonuna tiklar")
    public void submitButonunaTiklar() {
        testCenterPage.submitButton.click();
    }

    @Then("giris yapildigini dogrula")
    public void girisYapildiginiDogrula() {
        //assertTrue(testCenterPage.loginSuccessfully.isDisplayed());
        testCenterPage.loginSuccessfully.shouldBe(visible);
    }

    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {

        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(Condition.checked);  // doğru condition kullanımı
        }

        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }

        if (text.equals("Red")&& !testCenterPage.red.isSelected()){
            testCenterPage.red.click();
            testCenterPage.red.shouldBe(checked);
        }

        if (text.equals("Blue")&& !testCenterPage.blue.isSelected()){
            testCenterPage.blue.click();
            testCenterPage.blue.shouldBe(checked);
        }

        if (text.equals("Football")&& !testCenterPage.football.isSelected()){
            testCenterPage.football.click();
            testCenterPage.football.shouldBe(checked);
        }
    }

    @And("yili dropdowndan {int} olarak sec")
    public void yiliDropdowndanOlarakSec(int year) {
        testCenterPage.year.selectOptionByValue(year+"");
    }

    @And("ayi dropdowndan {string} olarak sec")
    public void ayiDropdowndanOlarakSec(String month) {
        testCenterPage.month.selectOption(month);
    }

    @And("gunu dropdowndan {int} olarak sec")
    public void gunuDropdowndanOlarakSec(int day) {
        testCenterPage.day.selectOptionByValue(day+"");
    }
}
