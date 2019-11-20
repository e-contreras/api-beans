package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Data
public class Productstore {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("available")
    private Integer available;
    @JsonProperty("purchase_prices")
    private BigInteger purchasePrice;
    @JsonProperty("sale_prices")
    private BigInteger salePrice;
    @JsonProperty("description")
    private String description;
    @JsonProperty("images")
    private List<String> images;
}
