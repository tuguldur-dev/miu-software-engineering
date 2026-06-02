package org.miu.lab.lab6.Model;

public class Contact {
    private String phone;
    private String email;

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public Contact(String phone, String email, String mail_address) {
        this.phone = phone;
        this.email = email;
        this.mail_address = mail_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String mail_address;

    @Override
    public String toString() {
        return "{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", mail_address='" + mail_address + '\'' +
                '}';
    }
}
