package com.bitlabs;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		HotelManagamentSystem h = new HotelManagamentSystemImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to XyZ hotel");
		System.out.println("=============================");
		h.addFood();
		System.out.println("----------------------");
		while(true) {

			System.out.println("1.Order Food\n2.Check out\n3.Exit\nEnter the choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: h.displayFood();
			h.orderFood();
			break;
			case 2: h.checkOut();
			break;
			case 3: System.out.println("Thank You!!");
			System.exit(0);
			break;
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice ");
				}
				catch(Exception e ) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		}
		


	}
		
	}


