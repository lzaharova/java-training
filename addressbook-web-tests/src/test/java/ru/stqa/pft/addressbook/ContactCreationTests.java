package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Larisa", "Zakharova", "Saint-Petersburg", "111-11-00", "222-22-00", "333-33-00", "larisa1@mail.ru", "larisa2@mail.ru", "larisa3@mail.ru"));
    submitContactCreation();
    returnToContactPage();
  }

}