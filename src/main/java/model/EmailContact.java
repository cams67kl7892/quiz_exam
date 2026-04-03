package model;

public class EmailContact {

    private long id;
    private String label;
    private String email;

    public EmailContact() {
    }

    public EmailContact(long id, String label, String email) {
        this.id = id;
        this.label = label;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
