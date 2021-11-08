package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//setting driver path for the browser
        WebDriver driver = new ChromeDriver();//object creation
        driver.get(baseUrl);
        driver.manage().window().maximize(); //maximise window
        String getTitle = driver.getTitle();//storing website title
        System.out.println(getTitle);//printing the title
        driver.close();//closing the window
    }
}
