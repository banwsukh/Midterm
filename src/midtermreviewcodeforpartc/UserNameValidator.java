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
        if (name == "" || name == null) {
            return false;
        }
        return true;
    }
}
