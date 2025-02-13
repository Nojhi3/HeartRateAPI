package dev.janitri.HeartRateAPI;
import dev.janitri.HeartRateAPI.HeartRate;
import dev.janitri.HeartRateAPI.HeartRateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heart-rates")
public class HeartRateController {

    private final HeartRateService heartRateService;

    public HeartRateController(HeartRateService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @PostMapping
    public HeartRate recordHeartRate(@RequestBody HeartRate heartRate) {
        return heartRateService.recordHeartRate(heartRate);
    }

    @GetMapping("/{patientId}")
    public List<HeartRate> getHeartRatesByPatient(@PathVariable Long patientId) {
        return heartRateService.getHeartRatesByPatientId(patientId);
    }
}
