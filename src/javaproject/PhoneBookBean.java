package javaproject;

/**
 *
 * @author Vaibhavi
 */
public class PhoneBookBean {
    private long number;
    private String name;
    private byte[] photo;
    
    public PhoneBookBean(String name, long number,byte[] photo){
        this.name = name;
        this.number = number;
        this.photo=photo;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
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
