/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;

/**
 *
 * @author zihan
 */
public class messageTotal implements Visitor{
    
    @Override
    public int visit(user node) {
        return node.getNews().size();
    }
    
}
