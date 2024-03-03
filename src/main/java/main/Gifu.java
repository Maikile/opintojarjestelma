package main;

import java.util.ArrayList;

public class Gifu {
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addStudent(Student student){
        students.add(student);
    }
    
    public void listCourses(){
        int i = 0;
        for (Course course : courses) {
            System.out.println(i+") "+course.getCourseId()+" "+course.getCourseName());
            i++;
        }
    }

    public void listStudents(){
        int i = 0;
        for (Student student : students) {
            System.out.println(i+") "+student.getStudentId()+" "+student.getStudentName());
            i++;
        }
    }

}
