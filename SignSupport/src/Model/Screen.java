/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luvo
 */

public class Screen {

    private final String screenID;
    private final String screenCaption;
    private final String videoURL;
    private final String iconURL;

    public Screen(String screenID, String screenCaption, String videoURL, String iconURL) {
        this.screenID = screenID;
        this.screenCaption = screenCaption;
        this.videoURL = videoURL;
        this.iconURL = iconURL;
    }

    public Screen(String screenID, String screenCaption, String videoURL) {
        this.screenID = screenID;
        this.screenCaption = screenCaption;
        this.videoURL = videoURL;
        iconURL=null;
    }

    public String getScreenID() {
        return screenID;
    }

    public String getScreenCaption() {
        return screenCaption;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public String getIconURL() {
        return iconURL;
    }  
}
