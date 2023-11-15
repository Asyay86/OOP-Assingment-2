/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitter;

/**
 *
 * @author zihan
 */
public class userTotal implements Visitor{

    public int num = 0;
    
    @Override
    public int visit(user node) {
        if(node instanceof user){
            num++;
        }
        return num;
    }
    
    public int getNum(){
        return num;
    }
     
    
}
