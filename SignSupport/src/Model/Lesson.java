/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Luvo
 */
public class Lesson {
    private enum LessonType
    {
        O,E,S;
    }
    private final String lessonID;
    private final String lessonTitle;
    private final ArrayList<Screen> screens;
    private LessonType lessonType;
    
    public LessonType getLessonType() {
        return lessonType;
    }

    public Lesson(String lessonID, String lessonTitle, String lessonType) {
        this.lessonID = lessonID;
        this.lessonTitle = lessonTitle;
        this.screens = new ArrayList<>();
        this.lessonType = LessonType.valueOf(lessonType);
    }

    public String getLessonID() {
        return lessonID;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }
    public void add(Screen screen)
    {
        screens.add(screen);
    }
    public ArrayList<Screen> getScreens() {
        return screens;
    }
}
