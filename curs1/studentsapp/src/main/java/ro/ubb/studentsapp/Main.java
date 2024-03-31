package ro.ubb.studentsapp;

import ro.ubb.studentsapp.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        //student.grade = 9;
        System.out.println(student.getGrade());
        student.setGrade(9);
        System.out.println(student.getGrade());

//        ArrayList<Student> studentList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Paula");
        student1.setGrade(9);

        Student student2 = new Student(2, "Alexandra", 7);
//        System.out.println(student2);

        studentList.add(student1);
        studentList.add(student2);
        System.out.println(studentList);

        int idUpdate = 1;
        int newGrade = 5;

//        for(int i=0; i<studentList.size(); i++) {
//            if(studentList.get(i).getId() == idUpdate){
//                studentList.get(i).setGrade(newGrade);
//            }
//        }

//        for(Student s: studentList){
//            if(s.getId() == idUpdate) {
//                s.setGrade(newGrade);
//            }
//        }
//        studentList.forEach(s -> {
//            if(s.getId() == idUpdate) {
//               s.setGrade(newGrade);
//            }
//        } );
//        System.out.println(studentList);

        List<Student> studentsById = studentList.stream().filter(s -> s.getId() == idUpdate)
                .collect(Collectors.toList());
        studentsById.get(0).setGrade(newGrade);
        System.out.println(studentList);
    }
}










