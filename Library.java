import java.util.HashMap;
import java.util.Optional;
import java.io.Serializable;
import java.io.*;

public class Library implements Serializable
{
        // <Book.hashCode(), Book>
        private static HashMap<Integer, Resource> resources = new HashMap<Integer, Resource>();
        
        public Library() {};
        
        public static final void loadLibrary( String name )
        {
                if ( name.isEmpty() ) return;
                
                try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( name ) ) )
                {
                        resources = ( HashMap<Integer, Resource> )ois.readObject();
                        System.out.println( "Library loaded!" );
                }
                catch ( Exception e ) { System.out.println( "ERROR: " + e ); }
        }
        
        @SuppressWarnings( "unchecked" )
        public static final void saveLibrary( String name )
        {
                if ( name.isEmpty() ) return;
                
                try ( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( name ) ) )
                {
                        oos.writeObject( resources );
                        System.out.println( "Library saved!" );
                }
                catch ( IOException e ) { System.out.println( "ERROR: " + e ); }
        }
        
        public static final boolean destroyLibrary( String name )
        {
                if ( name.isEmpty() ) return false;
                
                return ( new File( name ) ).delete();
        }
        
        public static final Optional<Resource> retrieveResource( String name )
        {
                for ( Resource r: resources.values() )
                {
                        if ( r.name.equals( name ) ) return Optional.of( r );
                }
                
                return Optional.empty();
        }
        
        
        public static final void addResource( Resource resource )
        { resources.put( resource.hashCode(), resource ); }
        
        public static final void removeResource( Resource resource )
        {
                resources.remove( resource.hashCode() );
        }
        
        public static final void removeResource( String name )
        {
                for ( Resource r: resources.values() )
                {
                        if ( r.name.equals( name ) )
                        { resources.values().remove( r ); return; }
                }
        }
        
        public static final int booksCount()
        {
                int counter = 0;
                
                for ( Resource resource: resources.values() )
                { if ( resource instanceof Book ) counter++;  }
                
                return counter;
        }
        
        public static final void printLibrary()
        {
                for ( Resource resource: resources.values() )
                { System.out.println( resource ); }
        }
}
