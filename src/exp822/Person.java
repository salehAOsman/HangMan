package exp822;


public class Person {
	private String name; // 0 --> 10 point %12.5
	private int age; // 0 --> 10 point %12.5 tow of quizes 25% of grade
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//age
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
			//name
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
//equal name
	public boolean equalsName(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		/*if (this.age != other.age)
			return false;
*/
		if (name == null) {
			if (other.name != null)
				return false;
		} else 
			
			if (!name.equals(other.name))
			return false;
		return true;
	}

//equal age	
	public boolean equalsAge(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		
		if (this.age != other.age)
			return false;
		/*if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
*/
		return true;
	}
//Older age
	public boolean oldeerAge(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.age > other.age)
			return true;
		/*if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
*/
		return false;
	}

//youngerAge
		public boolean youngerAge(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (this.age < other.age)
				return true;
			/*if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
	*/
			return false;
		}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}