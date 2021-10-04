package newpackage;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdminDAO implements IAdminDAO {
    private HashMap<String,String> date;
    
    AdminDAO() {
        date = new HashMap<>();
        addAdmin("Vika","123");
    }
    private void addAdmin(String login,String password) {
        if(!date.containsKey(login))
            date.put(login, password);
    }
    private void deleteAdmin(String login) {
        if(date.containsKey(login))
            date.remove(login);
    }
    

    @Override
    public boolean existAdmin(String login, String password) {
        if(!date.containsKey(login)) return false;
        return date.get(login).equals(password);
    }
    
}
