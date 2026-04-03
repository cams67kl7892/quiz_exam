package model;

public class PhoneContact {
    private long id;
    private String label;
    private String phoneNumber;

    public PhoneContact() {
    }

    public PhoneContact(long id, String label, String phoneNumber) {
        this.id = id;
        this.label = label;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


