package com.project;



public class ToDo implements Comparable<ToDo> {
	private String todo;
	private int priority;
	private int year;
	private int month;
	private int day;
	
	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public ToDo(String todo, int priority, int year, int month, int day) {
		super();
		this.todo = todo;
		this.priority = priority;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return todo + "(priority=" + priority + ", year=" + year + ", month=" + month + ", day=" + day+ ")";
	}

	@Override
	public int compareTo(ToDo o) {
		// TODO Auto-generated method stub
		return this.priority-o.priority;
	}

}
