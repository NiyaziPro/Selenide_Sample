package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinitions {
    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        open(url);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int sec) {
        // selenide default wait is 4 sec
        sleep(sec * 1000);
    }

    @Then("onceki sayfaya gider")
    public void oncekiSayfayaGider() {
        back();
    }

    @Then("sonraki sayfaya gider")
    public void sonrakiSayfayaGider() {
        forward();
    }

    @Then("sayfayi yeniler")
    public void sayfayiYeniler() {
        refresh();
    }

    @Then("sayfayi acik tutar")
    public void sayfayiAcikTutar() {

    }

}
