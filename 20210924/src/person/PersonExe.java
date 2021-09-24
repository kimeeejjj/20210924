package person;

import java.util.Scanner;

public class PersonExe {
	public static Scanner scn = new Scanner(System.in);
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;
	

	private PersonExe() {
		persons = new Person[100];
		persons[0]=new Person("������",Gender.WOMAN, "01083701707");
		persons[1]=new Student("������",Gender.MAN, "01084701707","������");
		persons[2]=new Worker("������",Gender.WOMAN,"01073597354","JVM");
	}

	public static PersonExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("---------------");
			System.out.println("1.�߰� 2.��ȸ 3.���� 4.���� 5.����");
			System.out.println("---------------");
			int menu = readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("---�߰�---");
				addPerson();
			} else if (menu == 2) {
				System.out.println("---��ȸ---");
				showList();
			} else if (menu == 3) {
				System.out.println("---����---");
			} else if (menu == 4) {
				System.out.println("---����---");
			} else if (menu == 5) {
				System.out.println("-�����մϴ�. �̿����ּż� �����մϴ�.-");
				break;
			} else {
				System.out.println("-�߸� �Է��ϼ̽��ϴ�.-");
			}
		}
	}

	public void addPerson() {
		System.out.println("1.Person 2.Student 3.Worker");
		int choice=readInt("�޴��� �����ϼ���.>>");
		String name=readStr("�̸��� �Է��ϼ���.");
		Gender gender=choiceGender();
		String phone=readStr("����ó�� �Է��ϼ���.");
		Person person =null;
		if(choice==1) {
			person = new Person(name,gender,phone);			
		}else if(choice==2) {
			String school = readStr("�б��� �Է��ϼ���.");
			person = new Student(name,gender,phone,school);
		}else if(choice==3) {
			String company = readStr("ȸ�縦 �Է��ϼ���.");
			person = new Worker(name,gender,phone,company);	
		}
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i]==null) {
				persons[i]=person;
				break;
			}
		}
		System.out.println("���������� �߰��Ǿ����ϴ�.");
	}
		
	
	public Gender choiceGender() {
		while(true) {
			int gender=readInt("������ �Է��ϼ���. [���ڴ� 1, ���ڴ�2]");
			if(gender==1) {
				return Gender.MAN;
			}else if(gender==2) {
				return Gender.WOMAN;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void showList() {
		String name = readStr("�̸��� �Է��ϼ���.");
		
		
	
	
	
		

	public String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public int readInt(String msg) {
		System.out.println(msg);
		int answer = scn.nextInt();
		scn.nextLine();
		return answer;
	}

}
