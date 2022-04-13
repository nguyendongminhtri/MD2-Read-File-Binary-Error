package com.company.service;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Student;

import java.io.IOException;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static String PATH = "C:\\Users\\Admin\\IdeaProjects\\binaryFile\\src\\com\\company\\data\\student.txt";
    public static List<Student> studentList = ConfigReadAndWriteFile.readFromFile(PATH);

    @Override
    public List<Student> findAll() throws IOException {
        ConfigReadAndWriteFile.writeToFile(PATH, studentList);
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }
}
