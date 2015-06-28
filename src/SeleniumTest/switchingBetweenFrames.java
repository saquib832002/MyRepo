package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchingBetweenFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

        driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
        driver.switchTo().frame("classFrame");
        System.out.println("Class Frame selected");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.switchTo().defaultContent();
        //wait(2000);
        driver.switchTo().frame("packageListFrame");
        System.out.println("packageListFrame Frame selected");
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        System.out.println("Again back to Class Frame selected");
        driver.findElement(By.linkText("Index")).click();
        driver.quit();

	}

}
