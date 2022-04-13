package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;
import com.company.service.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = StudentServiceIMPL.studentList;
    StudentController studentController = new StudentController();
    public void showListStudent() throws IOException {
//        System.out.println(studentList);
        System.out.println(studentController.showListStudent());
        System.out.println("Enter quit to come back Menu");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void formCreateStudent() throws IOException {
      while (true){
          int id;
          if(studentList.size()==0){
              id = 1;
          } else {
              id = studentList.get(studentList.size()-1).getId()+1;
          }
          System.out.println("Enter the name Student: ");
          String name = scanner.nextLine();
          System.out.println("Enter the age Student: ");
          int age = Integer.parseInt(scanner.nextLine());
          Student student = new Student(id,name,age);
          studentController.createStudent(student);
          System.out.println("Enter any key to continue create Student or Enter quit to come back Menu");
          String backMenu = scanner.nextLine();
          if(backMenu.equalsIgnoreCase("quit")){
              new Main();
          }
      }

    }
}
