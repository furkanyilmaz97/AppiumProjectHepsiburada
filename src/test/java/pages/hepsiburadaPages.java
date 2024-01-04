package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class hepsiburadaPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategoributonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategorilerim\")");


    By filtrebutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");

    By markabutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Marka\")");

    By samsungbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Samsung\")");

    public hepsiburadaPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoritiklama() {
        driver.findElement(kategoributonu).click();
    }

    public void androidtelefontikla() {
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/imageViewItem\")"));
        ListofElement.get(6).click();

    }

    public void filtreTiklama() {
        driver.findElement(filtrebutonu).click();
    }

    public void markaTiklama() {
        driver.findElement(markabutonu).click();
    }

    public void samsungTiklama() {
        driver.findElement(samsungbutonu).click();
    }

    public void uygulatiklama() {
    }

    public void kapasiteTiklama() {
    }

    public void gpTiklama() {
    }

    public void urunlerigorTiklama() {
    }

    public void urunSepetEkle() {
    }

    public void sepeteGit() {
    }

    public void sepetKontrol() {
    }
}
