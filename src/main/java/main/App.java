package main;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        Course newCourse = null;
        Student newStudent = null;
        Gifu gifu = new Gifu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String course = sc.nextLine();
        boolean exit = false;
        while(!exit){
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            if(sc.hasNext()){
                String stringInput = sc.nextLine();
                int i = Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                    System.out.println("Anna kurssin nimi:");
                    String courseName = sc.nextLine();
                    System.out.println("Anna kurssin ID:");
                    String id = sc.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                    String stringMaxNumberOfStudents = sc.nextLine();
                    int maxNumberOfStudents = Integer.parseInt(stringMaxNumberOfStudents);
                    newCourse = new Course(courseName,id,maxNumberOfStudents);
                    gifu.addCourse(newCourse);
                    break;

                    case 2:
                    System.out.println("Anna opiskelijan nimi:");
                    String studentName = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String stringStudentId = sc.nextLine();
                    int studentId = Integer.parseInt(stringStudentId);
                    newStudent = new Student(studentName,studentId);
                    gifu.addStudent(newStudent);
                    break;

                    case 3:
                    gifu.listCourses();
                    break;

                    case 4:
                    gifu.listStudents();
                    break;

                    case 5:
                    gifu.listCourses();
                    System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                    String stringChoice = sc.nextLine();
                    int choice = Integer.parseInt(stringChoice);
                    gifu.listStudents();
                    System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                    String stringChoice2 = sc.nextLine();
                    int choice2 = Integer.parseInt(stringChoice2);

                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                }
            }
        }
    }
}
