package pom;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xwpf.usermodel.PositionInParagraph;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

    public class BasePage {

        WebDriver driver;

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }


        private static Logger LOGGER = Logger.getLogger("Falabella");
        //private static final Logger LOGGER = Logger.getLogger(DatosSistema.class);
        private static final int TIMEOUT = 10;
        private static final int POLLING = 100;

        private static WebDriverWait wait;


        protected void waitForElementToAppear(WebElement element) {

            wait.until(ExpectedConditions.visibilityOf(element));
        }

        protected void waitForElementToDisappear(WebElement locator) {
            wait.until(ExpectedConditions.invisibilityOf(locator));
        }

        protected void waitForTextToDisappear(WebElement locator, String text) {
            wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(locator, text)));
        }

        protected boolean waitForClick(WebElement element) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }

        protected boolean isVisible(WebElement webElement) {
            boolean isVisible;
            try {
                isVisible = webElement.isDisplayed();
            } catch (Exception e) {
                isVisible = false;
            }
            return isVisible;
        }

        public static void waitFor(int segundos) {
            try {
                Thread.sleep(segundos * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        public void Log(String ms) {
            LOGGER.info(ms);
        }

        public void position(WebDriver driver, WebElement element) {
            Actions act = new Actions(driver);
            act.moveToElement(element).perform();
            act.moveToElement(element).click().perform();
        }


        public void CapturaImagen(WebDriver webdriver, String fileWithPath) throws Exception {
            //Convert web driver object to TakeScreenshot
            TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
            //Call getScreenshotAs method to create image file
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
            File DestFile = new File("target/surefire-reports/" + fileWithPath + ".png");
            //Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
        }

        public void scroll() throws IOException {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }

        public void extendreport(String nombreTest, String Descripcion) throws IOException {

        }

        public void searchText() throws Exception {

        }

        public String getTitle() throws Exception {
            try {
                return driver.getTitle();
            } catch (Exception e) {
                throw new Exception("Could not get the tab title");
            }


        }
    }




