package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class ProductStorePost {

    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("solicitation_id")
    private Integer solicitationId;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("client_id")
    private Integer clientId;
    @JsonProperty("purchase_prices")
    private BigInteger purchasePrice;
    @JsonProperty("sale_prices")
    private BigInteger salePrice;

}
