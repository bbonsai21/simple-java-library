import java.lang.RuntimeException;

public class InvalidResourceException extends RuntimeException
{
        public InvalidResourceException( String exception )
        { super( exception ); }
}
