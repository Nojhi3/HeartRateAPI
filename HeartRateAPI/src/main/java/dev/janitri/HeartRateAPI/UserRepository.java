package dev.janitri.HeartRateAPI;

import dev.janitri.HeartRateAPI.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}