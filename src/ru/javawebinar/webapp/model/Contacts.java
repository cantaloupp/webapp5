package ru.javawebinar.webapp.model;

/**
 * mnikanor
 * 19.12.2014.
 */
public class Contacts extends  Resume{
    public String fullName;
    public String birthDate;
    public String location;
    public String phone;
    public  String skype;
    public  String eMail;
    public String homePage;

    public Contacts() {
        fullName = "John Smith";
        birthDate = "12.02.1982";
        location = "USA, LA, 90210";
        phone = "192156699880";
        skype = "mrsmith";
        eMail = "mrsmith@gmail.com";
        homePage = "smithdeveloper.com";
    }

    String getContacts() {
      return fullName + birthDate + location + phone + skype + eMail + homePage;

    }
}
