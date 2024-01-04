package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hepsiburadaPages;
import util.DriverFactory;

public class hepsiburadaStepDefinitions {

    hepsiburadaPages hepsiburadaPages = new hepsiburadaPages(DriverFactory.getDriver());

    @When("Kategorilere tikla")
    public void kategorilereTikla() {
        hepsiburadaPages.kategoritiklama();
    }

    @When("Android telefonlara tikla")
    public void androidTelefonlaraTikla() {
        hepsiburadaPages.androidtelefontikla();
    }

    @When("Filtre tikla")
    public void filtreTikla() {
        hepsiburadaPages.filtreTiklama();
    }

    @When("Marka tikla")
    public void markaTikla() {
        hepsiburadaPages.markaTiklama();
    }

    @When("Samsung tikla")
    public void samsungTikla() {
        hepsiburadaPages.samsungTiklama();
    }

    @When("Uygula tikla")
    public void uygulaTikla() {
        hepsiburadaPages.uygulatiklama();
    }

    @When("Kapasite tikla")
    public void kapasiteTikla() {
        hepsiburadaPages.kapasiteTiklama();
    }

    @When("{int} gb tikla")
    public void gbTikla(int arg0) {
        hepsiburadaPages.gpTiklama();
    }

    @When("Urunleri gor tikla")
    public void urunleriGorTikla() {
        hepsiburadaPages.urunlerigorTiklama();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        hepsiburadaPages.urunSepetEkle();
    }

    @When("Sepete gidilir")
    public void sepeteGidilir() {
        hepsiburadaPages.sepeteGit();
    }

    @Then("Urunun sepet kontrolu yapilir")
    public void urununSepetKontroluYapilir() {
        hepsiburadaPages.sepetKontrol();
    }
}
