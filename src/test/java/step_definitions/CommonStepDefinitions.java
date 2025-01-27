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
    public void saniyeBekler(int arg0) {
    }

    @Then("onceki sayfaya gider")
    public void oncekiSayfayaGider() {
    }

    @Then("sonraki sayfaya gider")
    public void sonrakiSayfayaGider() {
    }

    @Then("sayfayi yeniler")
    public void sayfayiYeniler() {
    }

    @Then("sayfayi acik tutar")
    public void sayfayiAcikTutar() {
    }

}
