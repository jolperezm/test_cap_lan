package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//span[contains(text(),'Recomendado')]")
    //(css = "div.sc-eGXxtx.keKadb main.sc-eetwQk.dCTbkr div.sc-glUWqk.kcetNK div.sc-bTiqRo.iFtoJq div.sc-gFXMyG.nnfQm li.sc-gQNndl.cutlUv:nth-child(1) div.sc-fvLVrH.eRuswY div.sc-eSePXt.maMoO div.sc-bOCYYb.bpIvuu div.sc-cNQqM.gjRNoM div.sc-iFUGim.fupCEn.flight-information:nth-child(1) > span.sc-clBsIJ.kaUpli")
    //xpath = "//*[contains(text(),'8:27')]")
    WebElement hInicio, hRetorno;

    @FindBy(xpath = "//*[contains(text(),'BASIC')]")
    WebElement tViaje;
    //@FindBy(id = "dialog0-0-dialog-title")
    //css = "body:nth-child(2) div.MuiDialog-root.sc-cIShpX.lakeIW:nth-child(24) div.MuiDialog-container.MuiDialog-scrollPaper:nth-child(3) > div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollPaper.MuiDialog-paperWidthFalse.col-sm-4.col-md-6.col-lg-6.MuiPaper-elevation24.MuiPaper-rounded")
    //WebElement banner;
    @FindBy(css = "#dialog0-0")
    WebElement banner;
    @FindBy(xpath = "//span[contains(text(),'Continuar sin equipaje')]")
    WebElement warningBag;
    // reciclaje @FindBy(xpath = "//span[contains(text(),'Recomendado')]")
    //WebElement hRetorno;
    @FindBy(id = "button9")
    WebElement btn_Cont;
    //@FindBy(css = ".RowSlot__RowStyle-d50ycw-0:nth-child(2) > .MapSlot__ColumnStyle-sc-1mrxp01-0:nth-child(1) path:nth-child(2)")
    @FindBy(css = "#cabins-group > div > div:nth-child(5) > div:nth-child(3) > div > button > svg")
    WebElement asientoIda, asientoRtno;
    @FindBy(id = "btn-next-flight")
    WebElement btn_SteVuelo;
    //Reciclaje @FindBy(css = "#cabins-group > div > div:nth-child(5) > div:nth-child(3) > div > button")
    //WebElement asientoRtno;
    @FindBy(id = "btn-confirm-and-continue")
    WebElement btn_Confirma;
    @FindBy(id = "button-cart-confirm")
    WebElement btn_Conf;
    @FindBy(id = "bag-modal-dialog")
    WebElement bannerTwo;
    @FindBy(id = "continueWithoutBagsButton")
    WebElement btn_Banner;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/section[1]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement firstName;
    @FindBy(xpath = "//*[@id='passengerDetails-firstName-ADT_1' ]")
    WebElement firstPsj;
    //@FindBy(css = "passengerDetails-lastName-ADT_1")
    @FindBy(css = "#passengerDetails-lastName-ADT_1")
    WebElement lastPsj;
    @FindBy(id = "passengerInfo-dateOfBirth-ADT_1")
    WebElement birthPsj;
    //@FindBy(css = "//body/div[@id='menu-passengerInfo.gender']/div[3]/ul[1]/li[1]")
    // @FindBy(css = "#passengerInfo-gender-ADT_1")
    //WebElement genderSlt;
    @FindBy(id = "mui-component-select-documentInfo.nationality")
    WebElement nationality;
    @FindBy(css = "#documentInfo-documentNumber-ADT_1")
    WebElement documentPsj;
    @FindBy(id = "passengerInfo-emails-ADT_1")
    WebElement emailPsj;
    @FindBy(id = "passengerInfo-phones0-number-ADT_1")
    WebElement phonePsj;
    @FindBy(id = "passengerFormSubmitButtonADT_1")
    WebElement btnSave;
    @FindBy(xpath = "//span[contains(text(),'Continuar')]")
    WebElement btn_Continuar;

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
        if (isVisible(banner)) {
            warningBag.click();
        } else waitFor(2);
    }

    public void hVuelta() {
        waitFor(3);
        hRetorno.click();
        waitFor(3);
        tViaje.click();
        waitFor(3);
        btn_Cont.click();
        waitFor(3);
    }

    public void sAsiento() {
        waitFor(5);
        asientoIda.click();
        waitFor(3);
        btn_SteVuelo.click();
        waitFor(3);
        asientoRtno.click();
        waitFor(3);
        btn_Confirma.click();
        waitFor(5);
        btn_Conf.click();
        waitFor(3);
        if (isVisible(bannerTwo)) {
            btn_Banner.click();
        } else waitFor(3);

    }

    public void pasajeros() {
        waitFor(3);
        firstName.click();
        firstPsj.sendKeys("Nombre Nombre");
        firstPsj.sendKeys(Keys.TAB);
        lastPsj.sendKeys("Apellido Apellido");
        birthPsj.click();
        birthPsj.sendKeys("16111988");
        //genderSlt.click();
        //genderSlt.sendKeys(Keys.TAB);
        //nationality.click();
        //nationality.sendKeys("Chile");
        //nationality.sendKeys(Keys.TAB);
        documentPsj.click();
        documentPsj.sendKeys("165470974");
        emailPsj.click();
        emailPsj.sendKeys("tucorreo_@outlook.cl");
        phonePsj.click();
        phonePsj.sendKeys("955669256");
        btnSave.click();
        waitFor(5);
        btn_Continuar.click();
        waitFor(15);

    }

}
