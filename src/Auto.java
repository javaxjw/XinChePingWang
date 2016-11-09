import java.io.Serializable;

/**
 * 奥迪车
 * 
 * @author KayWen
 *
 */
public class Auto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double weight;
	private double height;
	private String type;
	private String color;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(double weight, double height, String type, String color) {
		super();
		this.weight = weight;
		this.height = height;
		this.type = type;
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
