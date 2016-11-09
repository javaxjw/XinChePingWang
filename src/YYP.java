import java.io.Serializable;

/**
 * YYP来了
 * @author KayWen
 *
 */
public class YYP implements Serializable{
	
	private static final long serialVersionUID = 1L;
		private int age;
		private String name;
		
		public YYP() {
			// TODO Auto-generated constructor stub
		}

		public YYP(int age, String name) {
			super();
			this.age = age;
			this.name = name;
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
		
		
}
