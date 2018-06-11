package com.statistics.calculator;


//Matches the incoming data.
//From Attendance application.
public class RetrievelDataObject {

    private int courseID;

    private String courseName;

    private int studentID;


    private String StudentName;

    private String StudentSurname;

    private int TotalCourseMinutes;

    private int attendedMinutes;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSurname() {
        return StudentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        StudentSurname = studentSurname;
    }

    public int getTotalCourseMinutes() {
        return TotalCourseMinutes;
    }

    public void setTotalCourseMinutes(int totalCourseMinutes) {
        TotalCourseMinutes = totalCourseMinutes;
    }

    public int getAttendedMinutes() {
        return attendedMinutes;
    }

    public void setAttendedMinutes(int attendedMinutes) {
        this.attendedMinutes = attendedMinutes;
    }
}
