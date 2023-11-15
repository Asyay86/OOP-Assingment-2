/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;

/**
 *
 * @author zihan
 */
public interface Subject {
    public void notifyObservers(user user);
    public void add(user user);
}
