package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Larisa", "Zakharova", "Saint-Petersburg",
              "111-11-00", "222-22-00", "333-33-00",
              null, null, null));
    }
  app.getContactHelper().selectContact();
  app.getContactHelper().initContactModification();
  app.getContactHelper().fillContactForm(new ContactData("Larisa2", "Zakharova2", "Saint-Petersburg",
          "111-11-00", "222-22-00", "333-33-00",
          "larisa1@mail.ru", "larisa2@mail.ru", "larisa3@mail.ru"));
  app.getContactHelper().submitContactModification();
  app.getContactHelper().returnToContactPage();
  }
}
