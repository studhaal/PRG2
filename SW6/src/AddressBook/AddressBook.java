package AddressBook;

import java.util.ArrayList;

public class AddressBook
{
    ArrayList<AddressEntry> list;
    public AddressBook()
    { 
        list = new ArrayList<AddressEntry>();
    }

    public void tester()
    {
        AddressEntry a = new AddressEntry();
        a.setGivenName("Han3s");
        a.setFamilyName("Muster");
        a.setZipCode("6008");
        a.setResidence("Horw");
        a.setPhoneNumber("+41413391111");
        a.setEmailAddress("Hans.Muster@@@info.com");

        list.add(a);
    }
}
