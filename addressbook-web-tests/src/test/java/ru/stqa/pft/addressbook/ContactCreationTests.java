package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;


public class ContactCreationTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm();
    submitContactCreation();
    returnToContactPage();
  }

  private void returnToContactPage() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void submitContactCreation() {
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillContactForm() {
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Larisa");
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("Zakharova");
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("Saint-Petersburg");
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("111-11-00");
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("222-22-00");
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys("333-33-00");
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("larisa1@mail.ru");
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys("larisa2@mail.ru");
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys("larisa3@mail.ru");
  }

  private void initContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
