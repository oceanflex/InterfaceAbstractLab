/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author zsummers
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    public abstract void setCourseName(String courseName);

    
    public final double getCredits() {
        return credits;
    }
    public final String getCourseNumber() {
        return courseNumber;
    }
    public String getCourseName() {
        return courseName;
    }


}
