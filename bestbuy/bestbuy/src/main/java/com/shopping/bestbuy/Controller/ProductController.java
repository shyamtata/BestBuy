package com.shopping.bestbuy.Controller;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Endpoint for listing all products
    @GetMapping("/list")
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }
}

