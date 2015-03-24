package scrame;
import java.util.Scanner;

import lab.LabMgt;
import lecture.LectureMgt;
import professor.ProfessorMgt;
import tutorial.TutorialMgt;

public class Scrame {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: Add professor");
			System.out.println("2: Add lecture hall");
			System.out.println("3: Add tutorial");
			System.out.println("4: Add lab");
			System.out.println("5: quit");
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
				ProfessorMgt.professor();
				break;
			case 2:
				LectureMgt.lecture();
			    break;
			case 3:
				TutorialMgt.tutorial();
				break;
			case 4:
				LabMgt.lab();
				break;
			
			}
			
			
			

		
			
		
			

		
	}while (choice < 5);
	}

private int age;
private String name;
private char gender;
private String address;


	
	
public void person(){
	
	
}




public void lecture(){
	
	
}

public void tutorial(){
	
	
}


public void lab(){
	
	
	
}


}
