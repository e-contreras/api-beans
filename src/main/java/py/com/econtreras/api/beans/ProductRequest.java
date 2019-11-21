package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
    @NotEmpty(message = "the field code can't be empty")
    @NotNull(message = "the field code can't be null")
    @JsonProperty("code")
    private String code;
    @JsonProperty("bar_code")
    private String barCode;
    @NotEmpty(message = "the field description can't be empty")
    @NotNull(message = "the field description can't be null")
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("brand_id")
    private Integer brandId;
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("eraser")
    private short eraser;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("pictures")
    private byte[] file;
    private String model;
    @JsonProperty(value = "impuesto" , required = false)
    private Integer taxtType; 
}
