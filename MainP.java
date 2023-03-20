package com.project;
import java.util.*;

public class MainP {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		Implementaion impl = new Implementaion();
		while(true) {
			System.out.println("------Manage your TODOs------");
			System.out.println("Type\n1 to print all your TODOs\n2 to add a new TODO\n3 to mark a TODO as DONE");
			System.out.println("4 to print all open TODOs or all done TODOs\n5 to print all done TODOs\n ");
			System.out.println("6 to change priority and due date of a TODO\n5 to quit\n>Your choice?");
			int choice =scan.nextInt();
			switch(choice) {
			case 1:
				impl.printAllTodoS();
				break;

			case 2:
				impl.addNewTodo();
				break;

			case 3:
				impl.markAsDone();
				break;

			case 4:
				//doImpl.updateTodoList();
				break;

			case 5:
				System.out.println("------Thats all the list you got for now,you can exit now------");
				System.exit(0);

			default:
				try {
					String msg= "invalid input! Please enter valid choid";
					throw new InvalidChoiceException(msg);

				}
				catch(Exception e) {

					System.out.println(e.getMessage());

				}
			}

			System.out.println("======================");

		}
	}
}



