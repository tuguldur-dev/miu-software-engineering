package org.miu.lab.lab10.PatientsAppointmentsBookingApp.src.main.java.com.example.pams.service;

import com.example.pams.model.Patient;
import org.miu.lab.lab10.PatientsAppointmentsBookingApp.src.main.java.com.example.pams.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void addAllPatients(List<Patient> patients) {
        patientRepository.saveAll(patients);
    }


    public List<Patient> getAllPatientsSortedByAgeDesc() {
        return patientRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Patient::getAge).reversed())
                .toList();
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }


    public Optional<Patient> getPatientById(int id) {
        return patientRepository.findById(id);
    }


    public boolean removePatient(int id) {
        return patientRepository.deleteById(id);
    }


    public int getTotalPatients() {
        return patientRepository.count();
    }
}
