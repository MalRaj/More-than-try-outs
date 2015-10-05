package com.todo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ToDoPojo {
	private Date date;
	private List<String> toDoList = new LinkedList<String>();
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getToDoList() {
		return toDoList;
	}
	public void setToDoList(List<String> toDoList) {
		this.toDoList = toDoList;
	}
	@Override
	public String toString() {
		StringBuffer sb =new StringBuffer();
		sb.append("\n To Do List :: \n");
		for (int i=0;i<toDoList.size();i++) {
			sb.append(i+1).append(")").append(toDoList.get(i)).append("\n");
		}
		return sb.toString();
	}
	
}
