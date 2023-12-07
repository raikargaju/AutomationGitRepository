package paramiterizedConstructor;

class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit(String Fn,String Fw,int Fp,String Fc)
	{
		System.out.println("FRUIT DETAILS:");
		System.out.println("------------------------");
		FruitName = Fn;
		System.out.println("Fruit Name: "+FruitName);
		FruitWeight = Fw;
		System.out.println("Fruit Quantity: "+FruitWeight);
		FruitPrice = Fp;
		System.out.println("Fruit Price: "+FruitPrice);
		FruitColor = Fc;
		System.out.println("Fruit Color: "+FruitColor);
		System.out.println("************************");
	}
}

class Flower
{
	String FlowerName;
	String FlowerWeight;
	int FlowerPrice;
	String FlowerColor;
	Flower(String Fn,String Fw,int Fp,String Fc)
	{
		System.out.println("FLOWER DETAILS:");
		System.out.println("------------------------");
		FlowerName = Fn;
		System.out.println("Flower Name: "+FlowerName);
		FlowerWeight = Fw;
		System.out.println("Flower Weight: "+FlowerWeight);
		FlowerPrice = Fp;
		System.out.println("Flower Price: "+FlowerPrice);
		FlowerColor = Fc;
		System.out.println("Flower Color: "+FlowerColor);
		System.out.println("************************");
	}
}

class Vegetable
{
	String VegetableName;
	String VegetableWeight;
	int VegetablePrice;
	String VegetableColor;
	Vegetable(String Vn,String Vw,int Vp,String Vc)
	{
		System.out.println("VEGETABLE DETAILS:");
		System.out.println("------------------------");
		VegetableName = Vn;
		System.out.println("Vegetable Name: "+VegetableName);
		VegetableWeight = Vw;
		System.out.println("Vegetable Weight: "+VegetableWeight);
		VegetablePrice = Vp;
		System.out.println("Vegetable Price: "+VegetablePrice);
		VegetableColor = Vc;
		System.out.println("Vegetable Color: "+VegetableColor);
		System.out.println("************************");
	}
}

public class ObjectClassForFruitFlowerVegetable {

	public static void main(String[] args) {
		// Object Class For Fruit Flower Vegetable
		new Fruit("Orange","2 KG",250,"Orange");
		new Flower("Rose","1 KG",200,"Red");
		new Vegetable("Tomato","2 KG",180,"Red");
	}
}