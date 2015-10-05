package com.todo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
	private static ToDoPojo todo = new ToDoPojo();

	/*
	 * Add tasks
	 */
	private static void addTask(List<String> listStr) {
		todo.setDate(new Date());
		todo.setToDoList(listStr);
	}

	private static void removeTask(int id) {
		todo.getToDoList().remove(id - 1);
	}

	/**
	 * Input method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		int choice = 1;
		while (choice != 0) {
			Scanner scanner = new Scanner(System.in);
			// print menu choices
			System.out.println("MENU:");
			System.out.println("1 - Add item");
			System.out.println("2 - Remove item");
			System.out.println("3 - Total items ");
			System.out.println("0 - Quit");
			System.out.print("Enter your menu choice: ");

			try {
				choice = scanner.nextInt();
				int id = 0;
				scanner.nextLine(); // clear input stream
				switch (choice) {
				case 1: // ADD\
					System.out.println("Enter the task item to be added!");
					if (scanner.hasNext())
						list.add(scanner.nextLine());
					addTask(list);
					System.out.println("Added a new task item!"+todo.toString());
					break;
				case 2:
					System.out.println("Enter the task item to be removed!");
					if (scanner.hasNext())
						id = scanner.nextInt();
					removeTask(id);
					System.out.println("Removed the item from "+id+" !"+todo.toString());
					break;
				case 3:
					System.out.println("Total Pending Tasks :: "
							+ todo.getToDoList().size());
					System.out.println("Listing Total Pending Tasks \n"
							+ todo.toString());
					break;
				case 0:
					System.out.println("Done!!");
					break;
				default:
					System.out.println("Sorry, but " + choice
							+ " is not one of "
							+ "the menu choices. Please try again.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Sorry, but you must enter a number.");
				scanner.nextLine(); // clear bad input from stream
			}

		}
	}

}
