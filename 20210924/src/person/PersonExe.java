package person;

import java.util.Scanner;

public class PersonExe {
	public static Scanner scn = new Scanner(System.in);
	private static PersonExe singleton = new PersonExe();
	private Person[] persons;
	

	private PersonExe() {
		persons = new Person[100];
		persons[0]=new Person("김은지",Gender.WOMAN, "01083701707");
		persons[1]=new Student("김조선",Gender.MAN, "01084701707","경기공고");
		persons[2]=new Worker("김은혜",Gender.WOMAN,"01073597354","JVM");
	}

	public static PersonExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("---------------");
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("---------------");
			int menu = readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("---추가---");
				addPerson();
			} else if (menu == 2) {
				System.out.println("---조회---");
				showList();
			} else if (menu == 3) {
				System.out.println("---수정---");
			} else if (menu == 4) {
				System.out.println("---삭제---");
			} else if (menu == 5) {
				System.out.println("-종료합니다. 이용해주셔서 감사합니다.-");
				break;
			} else {
				System.out.println("-잘못 입력하셨습니다.-");
			}
		}
	}

	public void addPerson() {
		System.out.println("1.Person 2.Student 3.Worker");
		int choice=readInt("메뉴를 선택하세요.>>");
		String name=readStr("이름을 입력하세요.");
		Gender gender=choiceGender();
		String phone=readStr("연락처를 입력하세요.");
		Person person =null;
		if(choice==1) {
			person = new Person(name,gender,phone);			
		}else if(choice==2) {
			String school = readStr("학교를 입력하세요.");
			person = new Student(name,gender,phone,school);
		}else if(choice==3) {
			String company = readStr("회사를 입력하세요.");
			person = new Worker(name,gender,phone,company);	
		}
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i]==null) {
				persons[i]=person;
				break;
			}
		}
		System.out.println("성공적으로 추가되었습니다.");
	}
		
	
	public Gender choiceGender() {
		while(true) {
			int gender=readInt("성별을 입력하세요. [남자는 1, 여자는2]");
			if(gender==1) {
				return Gender.MAN;
			}else if(gender==2) {
				return Gender.WOMAN;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void showList() {
		String name = readStr("이름을 입력하세요.");
		
		
	
	
	
		

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
