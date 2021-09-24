package person;

public class Person {
	//필드
	private String name;
	private Gender gender;
	private String phone;
	
	//생성자
	public Person(String name, Gender gender, String phone) {
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	}
	

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Person [이름=" + name + ", 성별=" + gender + ", 연락처=" + phone + "]";
	}	
	
	
}
