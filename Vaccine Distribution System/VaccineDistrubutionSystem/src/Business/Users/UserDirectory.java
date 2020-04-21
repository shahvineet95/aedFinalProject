/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import java.util.ArrayList;

/**
 *
 * @author India
 */
public class UserDirectory {
    private ArrayList<User> userList;

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    public User createUser(String name, String emaiId, String phoneNumber){
        User user = new User();
        user.setName(name);
        user.setEmailId(emaiId);
        user.setPhoneNumber(phoneNumber);
        userList.add(user);
        return user;
    }
}
