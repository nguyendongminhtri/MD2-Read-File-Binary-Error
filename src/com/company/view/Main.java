package com.company.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public Main() throws IOException {
    Scanner scanner = new Scanner(System.in);
    StudentView studentView = new StudentView();
    System.out.println("========================STUDENT MANAGE ================================");
    System.out.println("1. CREATE STUDENT");
    System.out.println("2. SHOW LIST STUDENT");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
           studentView.formCreateStudent();
           break;
        case 2:
            studentView.showListStudent();
            break;
    }
}
    public static void main(String[] args) throws IOException {
	// write your code here
        new Main();
    }
}
