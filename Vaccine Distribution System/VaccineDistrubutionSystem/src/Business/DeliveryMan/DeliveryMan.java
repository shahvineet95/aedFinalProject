/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.awt.image.BufferedImage;

/**
 *
 * @author imskr
 */
public class DeliveryMan {
    
    private String deliveryId;
    private String name;
    private String phoneNo;
    private String address;
    private BufferedImage photo;

    public DeliveryMan(String deliveryId, String name, String phoneNo, String address, BufferedImage photo) {
        this.deliveryId = deliveryId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.photo = photo;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public BufferedImage getPhoto() {
        return photo;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
