/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

/**
 *
 * @author imskr
 */
public class User {
    
    private String name;
    private String userName;
    private String password;
    private String address;
    private String phoneNumber;

    public User(String name, String userName, String password, String address, String phoneNumber) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
