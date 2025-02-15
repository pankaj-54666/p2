package rest.api.server;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class ProductController {


    @GetMapping("/get-products")
    public String getProductList(){

        log.info("ENTER get-product");
        return "Hello There";
    }

    @GetMapping("/get-one-product")
    public ProductDto getSingleProduct(){

        ProductDto productDto = new ProductDto();
        productDto.setProductId("1234");
        productDto.setProductName("mango product");
        productDto.setProductPrice(60);
        productDto.setProductDescription("mango ka junice manane ke liye");

        return productDto;
    }

    @PostMapping("/add-product")
    public String  saveProduct(@RequestBody ProductDto productDto){

        log.info("received request to create product: {}", productDto);

        //TODO: entry to datbase needed.
       int newPrice = productDto.getProductPrice() + 10;

       productDto.setProductPrice(newPrice);

       return productDto.getProductId();

    }

//    @PostMapping
//    @DeleteMapping
//    @PatchMapping
}
