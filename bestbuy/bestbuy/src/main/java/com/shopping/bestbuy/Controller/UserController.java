package com.shopping.bestbuy.Controller;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Endpoint for user registration
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Add logic for user registration
        // Save the user using userRepository.save(user)
        return ResponseEntity.ok("User registered successfully");
    }

    // Endpoint for retrieving user profile
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserProfile(@PathVariable Long userId) {
        // Fetch user from userRepository.findById(userId)
        // Handle cases where user is not found
        return ResponseEntity.ok(user);
    }
}

