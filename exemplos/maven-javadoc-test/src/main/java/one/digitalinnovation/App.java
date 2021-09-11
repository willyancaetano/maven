package one.digitalinnovation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        User user = new User("willyan", "1247@#aa12");
        user.enable();

        System.out.println(user.getStatus());
    }
}
