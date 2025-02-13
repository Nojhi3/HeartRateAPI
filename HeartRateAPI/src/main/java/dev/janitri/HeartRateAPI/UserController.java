package dev.janitri.HeartRateAPI;
import dev.janitri.HeartRateAPI.User;
import dev.janitri.HeartRateAPI.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }
}
