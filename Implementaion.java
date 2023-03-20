package com.project;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Implementaion {
	Scanner scan= new Scanner(System.in);
	List<ToDo> list = new Vector<ToDo>();
//	List<String> list1 = new Vector<String>();
	List<String> list2 = new Vector<String>();

	public void printAllTodoS() {
		System.out.println("You have"+list.size()+"TODOs:");
		if(list.size()!=0) {
			for(int i=0;i<list.size();i++) {
				System.out.println("OPEN: "+list.get(i));
			}
		}
		else {
			try {
				String msg= "Your TODO is Empty...! Nothing to Show ";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}

	}

//	public void printAllOpenTodoS() {
//		for (int i =0;i<list1.size();i++) {
//			System.out.println("Open: "+list1.get(i));
//		}
//	}

	public void printDoneTodoS() {
		for (int i =0;i<list2.size();i++) {
			System.out.println("Done: "+list2.get(i));
		}
	}
	public void addNewTodo() {

		System.out.println("Enter your new TODO");
		String todo=scan.next();
		System.out.println("Enter priority");
		int priority= scan.nextInt();
		System.out.println("Enter Due Date year");
		int year= scan.nextInt();
		System.out.println("Enter Due Date month");
		int month= scan.nextInt();
		System.out.println("Enter Due Date day");
		int day= scan.nextInt();
		Date date= new Date(year, month, day);
		ToDo td= new ToDo(todo, priority, year, month, day);
		list.add(td);

	}

	public void markAsDone() {

		if(list.size()!=0) {
			System.out.println("Enter TODO to change to DONE");
			String todo = scan.next().toLowerCase();
			if(list.contains(todo));	
			else {
				try {
					String msg= "The Entered TODO is Not Present...! please check the list once again and enter the correct TODO to mark as done ";
					throw new  EmptyToDoListException(msg);

				}
				catch(Exception e) {

					System.out.println(e.getMessage());

				}
			}
			
			list2.add(todo);
		}
		else {
			try {
				String msg= "you havent Added the dolist and  completed a single task yet please complete and mark as done";
				throw new  EmptyToDoListException(msg);

			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}
	}
	
 public void changePriority() {
	 
 }
}
