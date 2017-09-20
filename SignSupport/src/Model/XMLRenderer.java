/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;

import java.io.File;
/**
 *
 * @author Student
 */
public class XMLRenderer {
    Document doc;
    public XMLRenderer(String filename)
    {
        try {

	File file = new File(filename);

	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	doc = dBuilder.parse(file);
        
	doc.getDocumentElement().normalize();
        
        
    } catch (Exception e) {
	System.out.println(e.getMessage());
    }
  }

    public Document getDoc() {
        return doc;
    }
}
