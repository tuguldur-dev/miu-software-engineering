package org.miu.lab.lab10.PatientsAppointmentsBookingApp.src.main.java.com.example.pams.repository;

import com.example.pams.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class PatientRepository {

    private final List<Patient> patients = new ArrayList<>();

    public Patient save(Patient patient) {
        patients.add(patient);
        return patient;
    }

    public void saveAll(List<Patient> patientList) {
        patients.addAll(patientList);
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }

    public Optional<Patient> findById(int id) {
        return patients.stream()
                       .filter(p -> p.getPatientId() == id)
                       .findFirst();
    }

    public boolean deleteById(int id) {
        return patients.removeIf(p -> p.getPatientId() == id);
    }

    public int count() {
        return patients.size();
    }
}
