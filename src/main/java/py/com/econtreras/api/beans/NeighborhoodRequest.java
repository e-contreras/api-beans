package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NeighborhoodRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer neighborhoodId;
    @NotEmpty(message = "the field description can't be empty")
    @NotNull(message = "the field description can't be null")
    @JsonProperty("description")
    private String description;
    @JsonProperty("city_id")
    private Integer cityId;
}
