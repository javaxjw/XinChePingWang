import java.io.Serializable;

/**
 * 君娃
 * @author KayWen
 *
 */
public class LZJ implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private String habbit;
	
	public LZJ() {
		// TODO Auto-generated constructor stub
	}

	public LZJ(int age, String name, String habbit) {
		super();
		this.age = age;
		this.name = name;
		this.habbit = habbit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabbit() {
		return habbit;
	}

	public void setHabbit(String habbit) {
		this.habbit = habbit;
	}
	
	
}
