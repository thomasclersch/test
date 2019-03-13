
/**
 * A guess the password.
 *
 * @author Tommy Lersch
 * @version 11/20/18
 */
public class reverse
{
    public static final String SECRET_PASSWORD = "WAFFLES";
    
    static String obfuscate(String input)
    {
        return input.replace('A', 'M').concat("SYRUP").replace('S', 'W').concat("PANCAKES");
    }
    
    public static void main (String [] args) 
    {
        if(args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
            return;
        }
        
        if(args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println ("You win! Congratulations!");
        }
        
        else
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
