import java.io.Serializable;

abstract class Resource implements Comparable<Resource>, Serializable
{
        @Override
        public abstract String toString();

        protected String name, author;
        protected Integer ID;
        protected float price;
        
        public Resource( String resource_name, String author_name, float price )
        {
                if ( resource_name.isBlank() ) throw new EmptyResourceNameException();
                if ( author_name.isBlank() ) throw new EmptyResourceAuthorException();
                if ( price < 0 ) throw new NegativeResourcePriceException();
                
                this.name = resource_name; this.author = author_name; this.price = price;
        }
        
        public String getName()
        { return this.name; }
        
        public void setName( String new_name )
        {
                if ( new_name.isBlank() ) throw new EmptyResourceNameException();
                
                this.name = new_name;
        }
        
        public String getAuthor()
        { return this.author; }
        
        public void setAuthor( String new_author )
        {
                if ( new_author.isBlank() ) throw new EmptyResourceAuthorException();
                
                this.author = new_author;
        }
        
        public float getPrice()
        { return this.price; }
        
        public void setPrice( int new_price )
        { 
                if ( new_price < 0 ) throw new NegativeResourcePriceException();
                
                this.price = new_price;
        }
        
        @Override
        public int compareTo(Resource r)
        {
                if ( r == null ) return 1;
                
                return Float.compare( this.price, r.price );
        }
}
