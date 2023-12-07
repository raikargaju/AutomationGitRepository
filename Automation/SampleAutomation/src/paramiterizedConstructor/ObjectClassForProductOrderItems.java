package paramiterizedConstructor;

class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
	Product(int Pid,String Pn,String Pt,int Pa)
	{
		System.out.println("PRODUCT DETAILS:");
		System.out.println("------------------------");
		PrdID = Pid;
		System.out.println("Product ID: "+PrdID);
		PrdName = Pn;
		System.out.println("Product Name: "+PrdName);
		PrdType = Pt;
		System.out.println("Product Type: "+PrdType);
		PrdAmt = Pa;
		System.out.println("Product Amount: "+PrdAmt);
		System.out.println("************************");
	}
}

class Order
{
	int OdrNo;
	String OdrName;
	int OdrAmt;
	int OdrQuantity;
	Order(int On,String Oname,int Oa,int Oq)
	{
		System.out.println("ORDER DETAILS:");
		System.out.println("------------------------");
		OdrNo = On;
		System.out.println("Order No: "+OdrNo);
		OdrName = Oname;
		System.out.println("Order Name: "+OdrName);
		OdrAmt = Oa;
		System.out.println("Order Amount: "+OdrAmt);
		OdrQuantity = Oq;
		System.out.println("Order Quantity: "+OdrQuantity);
		System.out.println("************************");
	}
}

class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
	Item(int In,String Iname,String It,int Ia)
	{
		System.out.println("ITEM DETAILS:");
		System.out.println("------------------------");
		ItmNo = In;
		System.out.println("Item No: "+ItmNo);
		ItmName = Iname;
		System.out.println("Item Name: "+ItmName);
		ItmType = It;
		System.out.println("Item Type: "+ItmType);
		ItmAmt = Ia;
		System.out.println("Item Amount: "+ItmAmt);
		System.out.println("************************");
	}
}

public class ObjectClassForProductOrderItems {

	public static void main(String[] args) {
		new Product(21,"Table Fan","Electronics",2500);
		new Order(22,"Core Java Book",320,21);
		new Item(23,"Charger","Electronics",225);
	}
}
