package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProductBean {
    @JsonProperty("id")
    private Integer id;
    @NotNull
    @NotEmpty
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("model")
    @NotNull
    @NotEmpty
    private String model;
    @NotNull
    @NotEmpty
    @JsonProperty("description")
    private String description;
    @JsonProperty("brand")
    private BrandBean brand;
    @JsonProperty("brand_id")
    @Min(value = 1, message = "Elija una marca")
    private Integer brandId;
    @JsonProperty("category")
    private CategoryBean category;
    @Min(value = 1, message = "Elija una categoría")
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("code")
    @NotNull
    @NotEmpty
    private String code;
    @JsonProperty("file")
    private MultipartFile file;
    @JsonProperty("image_db")
    private String imageDB;
    private Integer quantity;
    @JsonProperty(value="impuesto", required = false)
    private Integer taxtType;  


}
