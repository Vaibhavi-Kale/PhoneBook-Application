package javaproject;

/**
 *
 * @author Vaibhavi
 */
public class PhoneBookBean1 {
    private String number;
    private String name;
    private byte[] photo;
    
    public PhoneBookBean1(String name, String number,byte[] photo){
        this.name = name;
        this.number = number;
        this.photo=photo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }   
    
} 
