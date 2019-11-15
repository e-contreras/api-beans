package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class FeeRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("fee_number")
    private Integer feeNumber;
    @JsonProperty("ponderator")
    private Float ponderator;
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("products_id")
    private String productsId;
    
}
