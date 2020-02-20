/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author vicba
 */
public class UserNameValidator {
    
    public boolean goodUsername(String name) {
        System.out.println("received from userbane val meth " + name);
        if (name.equals("") || name.equals(null)) {
        
            return false;
        }
        return true;
    }
}
