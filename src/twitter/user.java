/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author zihan
 */
public class user extends Composite implements Subject, twitter.Observer{
    
    public user(String ID){
        uniqueID = ID;
        this.following = new DefaultListModel<>();
        this.followers = new DefaultListModel<>();
        this.news = new DefaultListModel<>();
    }
    
    //User's ID
    private String uniqueID;
    
    //List to record user's followers
    private DefaultListModel<String> following = new DefaultListModel<>();
    
    //List to record who user follows
    private DefaultListModel<String> followers = new DefaultListModel<>();
    
    //Updated news feed
    private DefaultListModel<String> news = new DefaultListModel<>();
    
    //Storing tweet 
    private String message;
    
    private JFrame frame = new userView(this);
    
    public void addFollowing(String s){
        following.addElement(s);
    }
    
    public void addFollower(String s){
        followers.addElement(s);
    }
    
    public void addTweet(String s){
        news.addElement(s);
    }
    
    public DefaultListModel getFollowing(){
        return following;
    }
    
    public DefaultListModel getFollowers(){
        return followers;
    }
    
    public DefaultListModel getNews(){
        return news;
    }
    
    public void setVisible(){
        this.frame.setVisible(true);
        this.frame.setTitle(getID());
    }
    
    public void setMessage(String m){
        this.message = m;
    }

    @Override
    public void setID(String ID) {
        this.uniqueID = ID;
    }

    @Override
    public String getID() {
        return this.uniqueID;
    }

    @Override
    public String toString() {
        return this.getID();
    }

    @Override
    public void add(twitter.Observer observer) {
        
    }

    @Override
    public void update(Subject data) {
        if(data instanceof user){
            user following = (user) data;
            news.lastElement();
        }
    }

    @Override
    public void notifyObservers(twitter.Observer observer) {
        observer.update(this);
    }
    
    public int accept(Visitor visitor){
        return visitor.visit(this);
    }
   
    
    
}
