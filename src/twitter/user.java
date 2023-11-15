/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;


/**
 *
 * @author zihan
 */
public class user extends Composite implements Subject, Observer{
    
    public user(String ID){
        uniqueID = ID;
        this.following = new DefaultListModel<>();
        this.followers = new DefaultListModel<>();
        this.news = new DefaultListModel<>();
    }
    
    //User's ID
    private String uniqueID;
    
    //List to record user's followers
    private DefaultListModel<user> following = new DefaultListModel<>();
    
    //List to record who user follows
    private DefaultListModel<user> followers = new DefaultListModel<>();
    
    //Updated news feed
    private DefaultListModel<String> news = new DefaultListModel<>();
    
    //Observer list
    private DefaultListModel<Subject> subjects = new DefaultListModel<>();
    
    //Storing tweet 
    private String message;
    
    private JFrame frame = new userView(this);
    
    public void postTweet(String content){
        
    }
    
    public void addFollowing(user s){
        following.addElement(s);
    }
    
    public void addFollower(user s){
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

    
    public int accept(Visitor visitor){
        return visitor.visit(this);
    }

    @Override
    public void update(Subject subject) {
        
    }

    @Override
    public void notifyObservers(user user) {
        for(int i = 0; i < subjects.size(); i++){
            
        }
    }

    @Override
    public void add(user user) {
        followers.addElement(user);
    }

   
    
    
}
