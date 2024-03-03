package main;

public class Course {
    private int maxNumberOfStudents;
    private String courseName;
    private String id;

    public Course(String courseName, String id, int maxNumberOfStudents){
        this.courseName = courseName;
        this.id = id;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseId(){
        return id;
    }
}
