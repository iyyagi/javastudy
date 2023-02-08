package school;

public class Subject extends Student {
	int kor;
	int eng;
	int math;
	int linux;
	int programmingLanguage; // 프로그래밍 언어
	int operatingSystem;
	int network;
	int ccna;
	int nosql;
	int dataStructure; // 자료구조
	int statistics; // 통계
	int sum;
	double avg;
	String grade;
	
	
	public Subject () {
		
	}
	
	public String programingSubject() {
	
		kor = randomScore();
		eng = randomScore();
		math = randomScore();
		programmingLanguage = randomScore();
		operatingSystem = randomScore();
		dataStructure = randomScore();
		return "국어" + kor + " " + "영어" + eng + " " + "수학" + math + " " + "프로그래밍" + programmingLanguage + " " + "운영체제" + operatingSystem + " " 
			 + dataStructure;
	}
	
	public String machineSubject() {
	
		kor = randomScore();
		eng = randomScore();
		math = randomScore();
		statistics = randomScore();
		programmingLanguage = randomScore();
		nosql = randomScore();
		return "국어" + kor + " " + "영어" + eng + " " + "수학" + math + " " + "통계학" + statistics 
				+ " " + "프로그래밍" + programmingLanguage + " " + "nosql" +nosql;
	}
	
	public int machine_sum() {
		return kor + eng + math + statistics + programmingLanguage + nosql;
	}
	
	public double machine_avg() {
		return (Math.round(machine_sum() / 6.0) * 100) / 100.0;
	}
	
	public String machine_grade() {
		if(machine_avg() >=90) {
			grade = "A";
		} else if (machine_avg() >= 80) {
			grade = "B";
		} else if (machine_avg() >= 70) {
			grade = "C";
		} else if (machine_avg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	
	public String networkSubject() {
		kor = randomScore();
		eng = randomScore();
		linux = randomScore();
		network = randomScore();
		ccna = randomScore();
		
		return "국어" + kor + " " + "영어" + eng + " " + "리눅스" + linux + " " + "네트워크" + network + " " + "ccna" + ccna;
	}
	
	public int network_sum() {
		return kor + eng + linux + network + ccna;
	}
	
	public double network_avg() {
		return (Math.round(network_sum() / 5.0) * 100) / 100.0;
	}
	
	public String network_grade() {
		if(network_avg() >=90) {
			grade = "A";
		} else if (network_avg() >= 80) {
			grade = "B";
		} else if (network_avg() >= 70) {
			grade = "C";
		} else if (network_avg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	
	public int program_sum() {
		return kor + eng + math + linux + programmingLanguage + operatingSystem + network + ccna + nosql +
				dataStructure + statistics;
	}
	
	public double program_avg() {
		return (Math.round(program_sum() / 11.0) * 100) / 100.0;
	}
	
	public String program_grade() {
		if(program_avg() >=90) {
			grade = "A";
		} else if (program_avg() >= 80) {
			grade = "B";
		} else if (program_avg() >= 70) {
			grade = "C";
		} else if (program_avg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
}
