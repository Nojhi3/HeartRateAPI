package dev.janitri.HeartRateAPI;
import dev.janitri.HeartRateAPI.HeartRate;
import dev.janitri.HeartRateAPI.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeartRateService {

    @Autowired
    private HeartRateRepository heartRateRepository;

    public HeartRate recordHeartRate(HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRatesByPatientId(Long patientId) {
        return heartRateRepository.findByPatientId(patientId);
    }
}