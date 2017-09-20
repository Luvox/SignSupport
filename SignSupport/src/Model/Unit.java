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
public class Unit {
    private String unitID;
    private String unitTitle;
    private ArrayList<Lesson> unitLessons;

    public Unit(String unitID, String unitTitle) {
        this.unitID = unitID;
        this.unitTitle = unitTitle;
        this.unitLessons = new ArrayList<>();
    }
    public String getUnitID() {
        return unitID;
    }
    public String getUnitTitle() {
        return unitTitle;
    }

    public ArrayList<Lesson> getUnitLessons() {
        return unitLessons;
    }
    public void add(Lesson lesson)
    {
        unitLessons.add(lesson);
    }
}
