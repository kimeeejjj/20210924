package person;

public class Student extends Person {
	private String school;
	
	public Student(String name, Gender gender, String phone, String school) {
		super(name,gender,phone);
		this.school=school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [�̸�="+this.getName()
				+", ����="+this.getGender()
				+", ����ó="+this.getPhone() 
				+", �б�="+school +"]";
	}
	
	
}
