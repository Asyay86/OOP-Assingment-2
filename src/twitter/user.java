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
    
    //List to record who the user is following
    private DefaultListModel<user> following = new DefaultListModel<>();
    
    //List to record user's followers
    private DefaultListModel<user> followers = new DefaultListModel<>();
    
    //Updated news feed
    private DefaultListModel<String> news = new DefaultListModel<>();
    
    //Storing tweet 
    private DefaultListModel<String> message = new DefaultListModel<>();
    
    private JFrame frame = new userView(this);
    
    public void postTweet(String content){
        
    }
    
    public void addFollowing(user s){
        following.addElement(s);
    }
    
    public void addFollower(user s){
        followers.addElement(s);
    }
    
    public void addMessage(String s){
        message.addElement(s);
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
    public void update(user subject) {
        subject.addTweet(this.message.lastElement());
    }

    @Override
    public void notifyObservers(user user) {
        for(int i = 0; i < followers.size(); i++){
            this.update(followers.getElementAt(i));
        }
    }

    @Override
    public void add(user user) {
        followers.addElement(user);
    }

   
    
    
}
