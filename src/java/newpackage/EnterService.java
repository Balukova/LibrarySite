/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author User
 */
public class EnterService {

    public void service(String login, String password, String button, AtomicReference<AdminDAO> adminDAO) {
        if (button.equals("Увійти як адміністратор")) 
            if(!adminDAO.get().existAdmin(login, password)) throw new IllegalArgumentException("Неправильний логін чи пароль");

    }
}
