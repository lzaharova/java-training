package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
  app.getContactHelper().selectContact();
  app.getContactHelper().initContactModification();
  app.getContactHelper().fillContactForm(new ContactData("Larisa2", "Zakharova2", "Saint-Petersburg",
          "111-11-00", "222-22-00", "333-33-00",
          "larisa1@mail.ru", "larisa2@mail.ru", "larisa3@mail.ru", null),false);
  app.getContactHelper().submitContactModification();
  app.getContactHelper().returnToContactPage();
  }
}
