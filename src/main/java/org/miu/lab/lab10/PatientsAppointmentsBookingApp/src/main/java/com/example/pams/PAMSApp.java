package org.miu.lab.lab10.PatientsAppointmentsBookingApp.src.main.java.com.example.pams;

import com.example.pams.model.Patient;
import com.example.pams.service.PatientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class PAMSApp implements CommandLineRunner {

    private final PatientService patientService;

    public PAMSApp(PatientService patientService) {
        this.patientService = patientService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PAMSApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Patient> patients = Arrays.asList(
            new Patient(1, "Daniel",  "Agar",       "(641) 123-0009",  "dagar@m.as",     "1 N Street",      LocalDate.of(1987,  1, 19)),
            new Patient(2, "Ana",     "Smith",       null,              "amsith@te.edu",  null,              LocalDate.of(1948, 12,  5)),
            new Patient(3, "Marcus",  "Garvey",      "(123) 292-0018",  null,             "4 East Ave",      LocalDate.of(2001,  9, 18)),
            new Patient(4, "Jeff",    "Goldbloom",   "(999) 165-1192",  "jgold@es.co.za", null,              LocalDate.of(1995,  2, 28)),
            new Patient(5, "Mary",    "Washington",  null,              null,             "30 W Burlington", LocalDate.of(1932,  5, 31))
        );

        patientService.addAllPatients(patients);

        List<Patient> sorted = patientService.getAllPatientsSortedByAgeDesc();

        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println(json);

        System.out.println("\nTotal patients registered: " + patientService.getTotalPatients());
    }
}
