package PizzaBeans;

public class PizzaOption {
	
	String name;
	int price;

	public PizzaOption(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString(){
		return (name + ": " + price);
	}
}
