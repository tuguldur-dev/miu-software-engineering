package org.miu.lab.lab6;
import org.json.JSONArray;
import org.miu.lab.lab6.Model.Contact;
import org.miu.lab.lab6.Model.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PAMSApp {
    static void main() {
        List<Patient> patients = new ArrayList<>(Arrays.asList(
                new Patient(1, "Daniel", "Agar",
                        LocalDate.of(1987, 1, 19),
                        new Contact("(641) 123-0009", "dagar@m.as", "1 N Street")),

                new Patient(2, "Ana", "Agar",
                        LocalDate.of(1948, 12, 5),
                        new Contact("", "amsith@te.edu", "")),

                new Patient(3, "Marcus", "Garvey",
                        LocalDate.of(2001, 9, 18),
                        new Contact("(123) 292-0018", "", "4 East Ave")),


                new Patient(4, "Jeff", "Goldbloom",
                        LocalDate.of(1995, 2, 28),
                        new Contact("(999) 165-1192", "jgold@es.co.za", "")),

                new Patient(5, "Mary", "Washington",
                        LocalDate.of(1932, 5, 31),
                        new Contact("", "", "30 W Burlington"))
        ));
        patients.sort(Patient.PatientComparator);
        JSONArray object = new JSONArray(patients);
        IO.println(object);
    }
}
