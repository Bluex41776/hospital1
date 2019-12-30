/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author altrk
 */
public class Validator implements Interface {
    
   public  boolean isValidate(String username,String password){
        
        if(username=="öğrenci"&&password=="181816050"){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    
}
