package org.miu.lab.lab6.Model;

import java.time.LocalDate;
import java.util.Comparator;

public class Patient {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Contact contact;

    public Patient(long id, String firstName, String lastName, LocalDate birthDate, Contact contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contact = contact;
    }

    public Patient(long id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", contact=" + contact +
                '}';
    }

    public static final Comparator<Patient> PatientComparator =
            Comparator.comparing(Patient::getBirthDate, Comparator.reverseOrder()).
                    thenComparing(e -> e.firstName).
                    thenComparing(e -> e.lastName);

    //    public String converToJson() throws IllegalAccessException {
//        StringBuilder st = new StringBuilder();
//        Field[] fields = this.getClass().getDeclaredFields();
//        st.append("{");
//        for (int i = 0; i < fields.length; i++) {
//            Field field = fields[i];
//            Object value = field.get(this);
//
//
//            st.append(field.getName()).append(":").append(value);
//            if (i < fields.length - 1) {
//                st.append(",");
//            }
//        }
//        st.append("}");
//
//        return st.toString();
//    }
}
