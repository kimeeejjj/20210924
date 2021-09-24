package person;

public class Worker extends Person {
	private String company;
	
	public Worker(String name, Gender gender, String phone, String company) {
		super(name,gender,phone);
		this.company=company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Student [�̸�="+this.getName()
		+", ����="+this.getGender()
		+", ����ó="+this.getPhone() 
		+", ȸ��="+company +"]";
	}
	
	
}