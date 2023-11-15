/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;

import javax.swing.tree.DefaultMutableTreeNode;


/**
 *
 * @author zihan
 */
public abstract class Composite extends DefaultMutableTreeNode{
    
    public abstract void setID(String ID);
    
    public abstract String getID();
    
    @Override
    public abstract String toString();
}
