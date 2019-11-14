package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CategoryBean {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
}
