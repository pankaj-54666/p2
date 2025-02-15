package rest.api.server;

import lombok.Data;



@Data
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private String productDescription;

}
