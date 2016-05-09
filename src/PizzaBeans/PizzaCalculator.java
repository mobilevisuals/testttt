package PizzaBeans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PizzaCalculator {
	
	private String thickness;
	private String size;
	private String name;
	private String phoneNumber;
	private String deliveryMethod;
	private String[] toppings;
	
	private float price;
	
	private ArrayList<String> thicknessOptions;
	private ArrayList<String> toppingOptions;
	private ArrayList<String> sizeOptions;
	private ArrayList<String> deliveryMethodOptions;
	
	public PizzaCalculator(){
		
		thicknessOptions = new ArrayList<>();
		thicknessOptions.add("thin, SEK 40");
		thicknessOptions.add("medium, SEK 45");
		thicknessOptions.add("thick, SEK 50");
		
		toppingOptions = new ArrayList<>();
		toppingOptions.add("cheese, SEK 3");
		toppingOptions.add("tomato sauce, SEK 2");
		toppingOptions.add("ham, SEK 5");
		toppingOptions.add("pineapple, SEK 3");
		toppingOptions.add("paprika, SEK 5");
		toppingOptions.add("garlic, SEK 1");
		toppingOptions.add("shrimp, SEK 5");
		toppingOptions.add("ruccola, SEK 4");
		toppingOptions.add("quorn, SEK 6");
		toppingOptions.add("cherry tomato, SEK 8");
		
		sizeOptions = new ArrayList<>();
		sizeOptions.add("kid\'s, 0.7 x price");
		sizeOptions.add("normal, 1 x price");
		sizeOptions.add("family, 1.5 x price");
		
		deliveryMethodOptions = new ArrayList<>();
		deliveryMethodOptions.add("Home delivery, SEK 30");
		deliveryMethodOptions.add("Pick up, SEK 0");
	}
	
	//	SETTERS
	
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	
	public void setThicknessOptions(ArrayList<String> thicknessOptions) {
		this.thicknessOptions = thicknessOptions;
	}
	
	public void setToppingOptions(ArrayList<String> toppingOptions) {
		this.toppingOptions = toppingOptions;
	}
	
	public void setDeliveryMethodOptions(ArrayList<String> deliveryMethodOptions) {
		this.deliveryMethodOptions = deliveryMethodOptions;
	}
	
	//	GETTERS

	public String getThickness() {
		return thickness;
	}
	
	public String getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public String[] getToppings() {
		return toppings;
	}

	public ArrayList<String> getThicknessOptions() {
		return thicknessOptions;
	}

	public ArrayList<String> getToppingOptions() {
		return toppingOptions;
	}

	public ArrayList<String> getSizeOptions() {
		return sizeOptions;
	}

	public void setSizeOptions(ArrayList<String> sizeOptions) {
		this.sizeOptions = sizeOptions;
	}

	public ArrayList<String> getDeliveryMethodOptions() {
		return deliveryMethodOptions;
	}
	
	public int getPrice() {
		
		price = 0;
		try {
			//	THICKNESS
			price += Integer.parseInt(
					this.thickness
					.split("SEK ")[1]);
			
			//	TOPPINGS
			for (String topping : toppings) {
				price += Integer.parseInt(topping
						.split("SEK ")[1]);
			}
			
			//	SIZE
			//	"kid\'s, 0.7 x price"
			price *= Float.parseFloat(this.size
					.split(", ")[1]
							.split(" x")[0]);
			
			//	DELIVERY METHOD
			price += Integer.parseInt(this.deliveryMethod.split("SEK ")[1]);
			
		} catch (Exception e){}
		
		return Math.round(price);
	}

}
