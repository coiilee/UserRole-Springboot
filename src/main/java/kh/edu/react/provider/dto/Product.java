package kh.edu.react.provider.dto;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
    private int productStock;
    private String productImageUrl;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
