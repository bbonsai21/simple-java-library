import java.util.LinkedList;

// NOTICE: here this.author is the naem of the PUBLISHER!
class Magazine extends Resource
{
        // book tags: e.g. beauty, news, etc.
        LinkedList<String> tags = new LinkedList<String>();

        public Magazine( String book_name, String publisher_name )
        { super( book_name, publisher_name, 0 ); }
        
        public Magazine( String book_name, String publisher_name, float price )
        { super( book_name, publisher_name, price ); }
        
        public Magazine( String book_name, String publisher_name, LinkedList<String> tags )
        { super( book_name, publisher_name, 0 ); this.tags = tags; } 
        
        public Magazine( String book_name, String publisher_name, float price, LinkedList<String> tags )
        { super( book_name, publisher_name, price ); this.tags = tags; }
        
        @Override
        public String toString()
        {
                String final_str =  "Magazine: " + this.name + "\nPublisher: " + this.author + "\nTags: ";
                
                for ( String tag: tags )
                {
                        final_str += tag + "; ";
                } 
                
                return final_str;
        }
}
