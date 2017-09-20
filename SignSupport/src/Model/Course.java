/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Course {
    private String courseID;
    private String courseTitle;
    private ArrayList<Unit> courseUnits;

    public Course(String courseID, String courseTitle) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseUnits = new ArrayList();
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    public void addCourseUnit(Unit unit)
    {
        this.courseUnits.add(unit);
    }
    public ArrayList<Unit> getCourseUnits() {
        return courseUnits;
    }

}
