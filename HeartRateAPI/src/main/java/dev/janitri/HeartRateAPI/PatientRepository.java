package dev.janitri.HeartRateAPI;
import dev.janitri.HeartRateAPI.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
