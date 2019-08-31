package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityResponse extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer cityId;
    @NotEmpty(message = "the field description can't be empty")
    @NotNull(message = "the field description can't be null")
    @JsonProperty("city_name")
    private String cityName;

}
