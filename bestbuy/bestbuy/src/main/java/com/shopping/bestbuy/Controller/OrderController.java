package com.shopping.bestbuy.Controller;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    // Endpoint for placing an order
    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        // Add logic for placing the order
        // Save the order using orderRepository.save(order)
        return ResponseEntity.ok("Order placed successfully");
    }

    // Endpoint for viewing order history for a user
    @GetMapping("/history/{userId}")
    public ResponseEntity<List<Order>> viewOrderHistory(@PathVariable Long userId) {
        // Fetch orders for the user from orderRepository.findByUserId(userId)
        return ResponseEntity.ok(orders);
    }
}
