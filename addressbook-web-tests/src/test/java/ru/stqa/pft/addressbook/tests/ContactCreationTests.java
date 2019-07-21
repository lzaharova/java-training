package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.getContactHelper().createContact(new ContactData("Larisa", "Zakharova", "Saint-Petersburg",
            "111-11-00", "222-22-00", "333-33-00",
            null, null, null));

  }

}