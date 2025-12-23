import java.util.Scanner;

public class Main
{
        void main( String[] args )
        {       
                Library.destroyLibrary( "Library.txt" );  
                Library.loadLibrary( "Library.txt" );
                
                System.out.println( "Your library was loaded." );
                System.out.println( "Adding resources..." );
                Library.addResource( new Book( "1984", "Orwell", 10, "new" ) );
                Library.addResource( new Magazine( "Limes", "GEDI Gruppo Editoriale" ) );
                Library.addResource( new Book( "Germania", "C. Caesar", 6 ) );
                Library.addResource( new Book( "Thus spoke Zarathustra", "Nietzsche", 10 ) );
                Library.addResource( new Magazine( "Beyond ", "Uninsubria" ) );
                
                System.out.println( "Your library:" );
                Library.printLibrary();
                
                System.out.println( "Checking out." );
                Library.saveLibrary( "Library.txt" );
        }
}
