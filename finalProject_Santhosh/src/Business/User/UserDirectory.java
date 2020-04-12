/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author imskr
 */
public class UserDirectory {
    
    private ArrayList<User> userList;

    public UserDirectory() {
        this.userList = new ArrayList<>();
    }

    public ArrayList<User> getDirectory() {
        return this.userList;
    }
    
    public boolean addUser(User user) {
        if (findUser(user.getUserName()) == null) {
            //add user, because the user with the same userName was not found in the userList
            this.userList.add(user);
            return true;
        } else {
            //user already exists in the list..
            return false;
        }
    }
    
    //method to find user, return type <User>
    private User findUser(String userName) {
        for (User u : this.userList) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
    
    public boolean updateUser(User newUser, User oldUser) {
        if (findUser(newUser.getUserName()) == null) {
            //user found.
            int position = getUserPosition(oldUser);
            this.userList.set(position, newUser);
            return true;
        } else {
            return false;
        }
    }
    
    private int getUserPosition(User user) {
        for (User u : this.userList) {
            if (u.equals(user)) {
                return this.userList.indexOf(u);
            }
        }
        
        return -1;
    }
    
    public void removeUser(User user) {
        this.userList.remove(user);
    }

}
