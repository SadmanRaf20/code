import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		System.out.println("\n********** Lab Task - 3 **********");
		System.out.println("-------------------------------------");
        System.out.println("NAME : Mohammed Ariyan Pathan");
        System.out.println("ID   : 22-46011-1");
		
		StoryBook sb1 = new StoryBook ();
		StoryBook sb2 = new StoryBook ("6546DP432","Harry Poter","J. K. Rowling",850.78,220,"Fiction");
		
		
		StoryBook.setDiscountRate(10.00);
		StoryBook.getDiscountRate();
		
		sb2.showDetails();
		
		sb2.addQuantity(7);
		sb2.sellQuantity(5);
		
		
		sb2.setIsbn("9876IT9999");
        sb2.setBookTitle("Sherlock Holmes");
        sb2.setAuthorName("Doyle");
        sb2.setPrice(450.70);
        sb2.setCategory("Detective");
		
		
		System.out.println("\nShowing Information of StoryBook");
        System.out.println("ISBN                                   : "+sb2.getIsbn());
        System.out.println("Book Title                             : "+sb2.getBookTitle());
        System.out.println("Author Name                            : "+sb2.getAuthorName());
        System.out.println("Price after Discount                   : "+sb2.getPrice()+" USD");
        System.out.println("Available Quantity                     : "+sb2.getAvailableQuantity());
        System.out.println("Category                               : "+sb2.getCategory());
		
		
		
		TextBook t1 = new TextBook();
        TextBook t2 = new TextBook("85247QT9888","Discrete Mathematics","Rosen",650.00,8,5);
		
		TextBook.setDiscountRate(30.00);
        TextBook.getDiscountRate();
		System.out.println("\nShowing Information of TextBook");
		t2.showDetails();
		
		
		
        t2.setIsbn("98764IIO6743");
        t2.setBookTitle("Java");
        t2.setAuthorName("Kathy Sierra");
        t2.setPrice(700.00);
        t2.setStandard(7);
		
		
		
        System.out.println("ISBN                                  : "+t2.getIsbn());
        System.out.println("Book Title                            : "+t2.getBookTitle());
        System.out.println("Author Name                           : "+t2.getAuthorName());
        System.out.println("Price After Discount                  : "+t2.getPrice()+" USD");
        System.out.println("Available Quantity                    : "+t2.getAvailableQuantity());
        System.out.println("Standard                              : "+t2.getStandard());
	}
}