package com.shopping.bestbuy.Controller;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartItemRepository cartItemRepository;

    // Endpoint for adding an item to the cart
    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestBody CartItem cartItem) {
        // Add logic for adding the item to the cart
        // Save the cartItem using cartItemRepository.save(cartItem)
        return ResponseEntity.ok("Item added to cart");
    }

    // Endpoint for removing an item from the cart
    @DeleteMapping("/remove/{cartItemId}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long cartItemId) {
        // Add logic for removing the item from the cart
        // Delete the cartItem using cartItemRepository.deleteById(cartItemId)
        return ResponseEntity.ok("Item removed from cart");
    }

    // Endpoint for viewing the cart
    @GetMapping("/view")
    public ResponseEntity<List<CartItem>> viewCart() {
        // Fetch cart items from cartItemRepository.findAll()
        return ResponseEntity.ok(cartItems);
    }
}
