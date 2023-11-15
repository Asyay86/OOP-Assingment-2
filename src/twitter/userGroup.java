/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;

import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

/**
 *
 * @author zihan
 */
public class userGroup extends Composite implements twitter.Observer{
    
    public userGroup(String ID){
        this.groupID = ID;
    }
    
    private String groupID;
    private DefaultListModel<String> users = new DefaultListModel<>();
    private DefaultListModel<String> groups = new DefaultListModel<>();
    
    
    
    
    
    //implement components
    @Override
    public void setID(String ID) {
        this.groupID = ID;
    }

    @Override
    public String getID() {
        return this.groupID;
    }

    @Override
    public String toString() {
        return this.getID();
    }

    @Override
    public void update(Subject data) {
        
    }

  
}
