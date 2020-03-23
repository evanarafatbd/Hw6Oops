package day6HW;

public abstract class Mamals {

	private String name, function;
	private int weight;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String name(String name) {
		this.name = name;
		System.out.println("The mamals name is" + name);
		return name;
	}
	
	public String function(String function) {
		this.function = function;
		System.out.println("Tiger likes to"+ function);
		return function;
	}
		
	public int weight(int weight) {
		this.weight = weight;
		System.out.println("The tiger weighs "+ weight+ " lbs");
		return weight;
	}
}
