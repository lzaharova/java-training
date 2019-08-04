package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("Larisa", "Zakharova", "Saint-Petersburg",
            "111-11-00", "222-22-00", "333-33-00",
            null, null, null));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }

}