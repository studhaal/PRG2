package AddressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressEntry
{
    private String givenName, familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String eMailAddress;

    public AddressEntry()
    {

    }

    public AddressEntry(String givenName, String familyName, 
                        String zipCode, String residence, 
                        String phoneNumber, String eMailAddress)
    {

    }

    public void setGivenName(String givenName) throws IllegalArgumentException
    {
        if(givenName == null)
        {
            throw new IllegalArgumentException("Vorname ist leer - NULL");
        }
        else if(containsNumbers(givenName))
        {
            throw new IllegalArgumentException(givenName + " Vorname enthält Zahlen");
        }
        else if(givenName.length()>20)
        {
            throw new IllegalArgumentException(givenName + " enthält mehr als 20 Zeichen");
        }
        else
        {
            this.givenName = givenName;
        }
    }

    public void setFamilyName(String familyName) throws IllegalArgumentException
    {
        if(familyName == null)
        {
            throw new IllegalArgumentException("familyName ist leer - NULL");
        }
        else
        {
            this.familyName = familyName;
        }
    }

    public void setZipCode(String zipCode) throws NumberFormatException
    {
        if(containsLetters(zipCode))
        {
            throw new NumberFormatException(zipCode + " enthält Buchstaben");
        }
        else if(zipCode.length()>4)
        {
            throw new NumberFormatException(zipCode + " ist länger als 4 Zeichen");
        }
        else
        {
            this.zipCode = zipCode;
        }
        //throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
    }

    public void setResidence(String residence)
    {

    }

    public void setPhoneNumber(String phoneNumber)
    {

    }

    public void setEmailAddress(String eMailAdresse) throws InvalidEmailException
    {
        if(!containsOneAt(eMailAdresse))
        {
            throw new InvalidEmailException(eMailAdresse + " contains no or more than one @");
        }
        else
        {
            this.eMailAddress = eMailAdresse;
        }
    }
    
    private boolean containsNumbers(String s){
        Pattern p = Pattern.compile("\\d");
        return p.matcher(s).find();
    }
    
    private boolean containsLetters(String s){
        Pattern p = Pattern.compile("[a-zA-Z]");
        return p.matcher(s).find();
    }
    
    private boolean containsOneAt(String s){
        int count = 0;
        Pattern p = Pattern.compile("[@]");
        Matcher m = p.matcher(s);
        while(m.find())
        {
            count++;
        }
        return count == 1;
    }
}
