package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer idProduct;
    @JsonProperty("code")
    private String code;
    @JsonProperty("bar_code")
    private String barCode;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("descripcion")
    private String description;
    @JsonProperty("estado")
    private short erased;
    @JsonProperty("marca")
    private String brand;
    @JsonProperty("categoria")
    private CategoryResponse category;
    @JsonProperty("imagenes")
    private List<String> images;
}
