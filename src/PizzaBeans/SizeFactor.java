package PizzaBeans;

public class SizeFactor {

	String name;
	float factor;
	
	public SizeFactor(String size, float factor){
		
		this.name = size;
		this.factor = factor;
	}

	public String getName() {
		return name;
	}

	public float getFactor() {
		return factor;
	}
	
	public String toString(){
		return (name + ": " + factor);
	}
}
