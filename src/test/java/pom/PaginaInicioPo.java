package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

import static com.sun.activation.registries.LogSupport.log;

public class PaginaInicioPo extends BasePage {


    public PaginaInicioPo(WebDriver driver) {
        super(driver);
    }

    //Elementos-declarar//

    String url = "https://www.latamairlines.com/cl/es";

    @FindBy(id = "txtInputOrigin_field")
    WebElement txtIda;

    @FindBy(id = "btnItemAutoComplete_0")
    WebElement btn_Ida;

    @FindBy(id = "txtInputDestination_field")
    WebElement txtDest;

    @FindBy(id = "btnItemAutoComplete_0")
    WebElement btn_Dest;

    @FindBy(id = "departureDate")
    WebElement btn_FIda;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    WebElement f_Ida;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]")
    WebElement f_Retorno;

    @FindBy(id = "btnSearchCTA")
    WebElement btn_Buscar;

    @FindBy(css = "div.sc-eGXxtx.keKadb main.sc-eetwQk.dCTbkr div.sc-glUWqk.kcetNK div.sc-bTiqRo.iFtoJq div.sc-gFXMyG.nnfQm li.sc-gQNndl.cutlUv:nth-child(1) div.sc-fvLVrH.eRuswY div.sc-eSePXt.maMoO div.sc-bOCYYb.bpIvuu div.sc-cNQqM.gjRNoM div.sc-iFUGim.fupCEn.flight-information:nth-child(1) > span.sc-clBsIJ.kaUpli")
    //xpath = "//*[contains(text(),'8:27')]")
    WebElement hInicio;

    @FindBy(xpath = "//*[contains(text(),'BASIC')]")
    WebElement tViaje;

    //@FindBy(id = "dialog0-0-dialog-title")
    //css = "body:nth-child(2) div.MuiDialog-root.sc-cIShpX.lakeIW:nth-child(24) div.MuiDialog-container.MuiDialog-scrollPaper:nth-child(3) > div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollPaper.MuiDialog-paperWidthFalse.col-sm-4.col-md-6.col-lg-6.MuiPaper-elevation24.MuiPaper-rounded")
    //WebElement banner;

    @FindBy(css = "#dialog0-0")
    WebElement banner;


    @FindBy(xpath = "//span[contains(text(),'Continuar sin equipaje')]")
    WebElement warningBag;

    @FindBy(css = "div.sc-eGXxtx.keKadb main.sc-eetwQk.dCTbkr div.sc-glUWqk.kcetNK div.sc-bTiqRo.iFtoJq div.sc-gFXMyG.nnfQm li.sc-gQNndl.cutlUv:nth-child(1) div.sc-fvLVrH.eRuswY div.sc-eSePXt.maMoO div.sc-bOCYYb.bpIvuu div.sc-cNQqM.gjRNoM div.sc-iFUGim.fupCEn.flight-information:nth-child(1) > span.sc-clBsIJ.kaUpli")
    WebElement hRetorno;

    @FindBy(id = "button9")
    WebElement btn_Cont;

    //Metodos-uso//
    public void start() {
        log("iniciando el test");
        driver.get(url);
        waitFor(3);
    }

    public void vueloIda() {
        waitFor(3);
        txtIda.click();
        waitFor(1);
        txtIda.sendKeys("SCL");
        waitFor(1);
        btn_Ida.click();
        waitFor(1);
    }

    public void vDestino() {
        txtDest.click();
        txtDest.sendKeys("ZCO");
        waitFor(1);
        btn_Dest.click();
        waitFor(1);
    }

    public void fIda() {
        btn_FIda.click();
        waitFor(3);
        f_Ida.click();
        waitFor(3);
    }

    public void fRetorno() {
        f_Retorno.click();
        waitFor(3);
        btn_Buscar.click();
        waitFor(3);
    }

    public void hInicioV() {
        waitFor(3);
        hInicio.click();
        waitFor(3);
        tViaje.click();
        waitFor(3);
        //if (isVisible(banner)) {
        //driver.switchTo().frame(By.cssSelector('#dialog0-0')).findElement((By) warningBag).click();
        //} else waitFor(5);
        if (isVisible(banner)) {
            warningBag.click();
        } else waitFor(3);


    }

    public void hVuelta() {
        waitFor(5);
        hRetorno.click();
        waitFor(5);
        tViaje.click();
        waitFor(5);
        btn_Cont.click();
        waitFor(10);
    }
}
