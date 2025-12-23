
public class Book extends Resource
{
        private String conditions = "unspecified";
        
        public Book( String book_name, String author_name )
        { super( book_name, author_name, 0 ); }
        
        public Book( String book_name, String author_name, String book_conditions )
        { super( book_name, author_name, 0 ); this.conditions = book_conditions; }
        
        public Book( String book_name, String author_name, float price )
        { super( book_name, author_name, price ); this.conditions = "unspecified"; }
        
        public Book( String book_name, String author_name, float price,  String book_conditions )
        { super( book_name, author_name, price ); this.conditions = book_conditions; }
        
        @Override
        public String toString()
        {
                return ( "Book name: " + this.name + "\nAuthor: " + this.author + "\nPrice: " + this.price + 
                "\nConditions: " + this.conditions );
        }
}
