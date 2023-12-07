package assignmentInheritance;
class Product
{
	String prodID;
	String brandName;
	int price;
	
	Product()
	{
		this.prodID = "Unknown";
		this.brandName = "Unknown";
		this.price = 0;
	}
	
	Product(String prodID)
	{
		this.prodID = prodID;
		this.brandName = "Keyboard";
		this.price = 250;
	}
	
	Product(String prodID,String brandName,int price)
	{
		this.prodID = prodID;
		this.brandName = brandName;
		this.price = price;
	}
	
	void displayProdinfo()
	{
		System.out.println("Product ID: "+prodID);
		System.out.println("Brand Name: "+brandName);
		System.out.println("Price: "+price);
	}
}

class Purchase extends Product
{
	String category;
	int quan;
	
	Purchase(String prodID,String category,int quan)
	{
		super();
		this.category = category;
		this.quan = quan;
	}
	
	Purchase(String prodID,String brandName,int price,String category,int quan)
	{
		super(prodID,brandName,price);
		this.category = category;
		this.quan = quan;
	}
	
	void diplaypurchseinfo()
	{
		System.out.println("Category: "+category);
		System.out.println("Quantity: "+quan);
	}
}

class Order extends Product
{
	String category;
	int quan;
	
	Order(String prodID,String category,int quan)
	{
		super();
		this.category = category;
		this.quan = quan;
	}
	
	Order(String prodID,String brandName,int price,String category,int quan)
	{
		super(prodID,brandName,price);
		this.category = category;
		this.quan = quan;
	}
	
	void diplayorderinfo()
	{
		System.out.println("Category: "+category);
		System.out.println("Quantity: "+quan);
	}
} 

class Sales extends Order
{
	String orderID;
	
	Sales(String prodID,String brandName,int price,String category,int quan,String orderID)
	{
		super(prodID,brandName,price,category,quan);
		this.orderID = orderID;
	}
	
	void displayorder()
	{
		System.out.println("OrderID: "+orderID);
	}
}
public class Hybridq7 {

	public static void main(String[] args) {
		// Question No 4
		System.out.println("Product/Purchase Details");
		System.out.println("------------------------");
		Purchase p = new Purchase("Prod002","Dell", 48580,"Electronics", 10);
		p.displayProdinfo();
		p.diplaypurchseinfo();
		System.out.println();
		
		System.out.println("Product/Order/Ssles Details");
		System.out.println("------------------------");
		Sales s = new Sales("PRD101", "Lenovo", 46580, "Electronics", 20, "Ord001");
		s.displayProdinfo();
		s.diplayorderinfo();
		s.displayorder();
	}
}