/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
/**
 *
 * @author Luvo
 */
public class Controller {
    private ArrayList<Lesson> lessons;
    private XMLRenderer xmlRender;
    private Course course;
    private ArrayList units;
    private ArrayList screens;
    public Controller() 
    {    
        lessons=new ArrayList();
        screens=new ArrayList();
        units=new ArrayList();
        //Prepare xml document for reading
        xmlRender=new XMLRenderer("xml\\e learner self study.xml");
        
        //read course node
        Node rootNode= xmlRender.doc.getDocumentElement();
        course=new Course(rootNode.getAttributes().item(1).getNodeValue(), rootNode.getAttributes().item(2).getNodeValue());
        
        //add units
        NodeList unitsNodes=rootNode.getChildNodes();
        for(int i=0;i<unitsNodes.getLength();i++)
        {
            //get unit data
            NamedNodeMap unitInfo = unitsNodes.item(i).getAttributes();
            Unit tempUnit=new Unit(unitInfo.item(0).getNodeValue(),unitInfo.item(1).getNodeValue());
            units.add(tempUnit);
            
            //add unit lessons
            NodeList unitLessons=unitsNodes.item(i).getChildNodes();
            for(int j=0;j<unitLessons.getLength();j++)
            {
                //add lesson
                NamedNodeMap lessonInfo = unitLessons.item(j).getAttributes();
                Lesson tempLesson=new Lesson(lessonInfo.item(1).getNodeValue(),lessonInfo.item(0).getNodeValue(),lessonInfo.item(2).getNodeValue());
                
                //add lesson to unit's lesson list
                tempUnit.add(tempLesson);
                lessons.add(tempLesson);
                
                //add lesson's screens
                NodeList lessonScreens=unitLessons.item(j).getChildNodes();
                for(int k=0;k<lessonScreens.getLength();k++)
                {
                    Screen tempScreen;
                    Node screenNode=lessonScreens.item(k);
                    NodeList screenElements=screenNode.getChildNodes();
                    String screenID=screenElements.item(0).getNodeValue();
                    String vidURL=screenElements.item(1).getNodeValue();
                    String screenDescr=screenElements.item(2).getNodeValue();
                    if(screenElements.getLength()>3)
                    {
                        String iconURL=screenElements.item(3).getNodeValue();
                        tempScreen=new Screen(screenID, screenDescr, vidURL,iconURL);
                    }
                    else
                    {
                        tempScreen=new Screen(screenID, screenDescr, vidURL);
                    }
                    
                    //add screen to lesson's screens list
                    tempLesson.add(tempScreen);
                    screens.add(tempScreen);
                }
            }
        }
    }

    /**

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }
    public Lesson findLessonByID(int lessonID)
    {
        for(Lesson lesson:lessons)
        {
            if(lesson.getLessonID()==lessonID)
            {
                return lesson;
            }
        }
        return null;
    }
    public Screen findLessonItemByID(int lessonID,int lessonItemID)
    {
        for(Lesson lesson:lessons)
        {
            if(lesson.getLessonID()==lessonID)
            {
                for(Screen lessonItem:lesson.getLessonItems())
                {
                    if(lessonItem.getLessonItemID()==lessonItemID)
                    {
                        return lessonItem;
                    }
                }
            }
        }
        return null;
    }
    **/
}
