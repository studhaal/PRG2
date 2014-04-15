//package AddressBook;
package AddressBook;

public class InvalidEmailException extends RuntimeException 
{
    public InvalidEmailException()
    {
        super();
    }
    public InvalidEmailException(String s)
    {
        super(s);
    }   
}
