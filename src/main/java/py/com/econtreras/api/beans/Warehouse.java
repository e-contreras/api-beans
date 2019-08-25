package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
    @NotEmpty(message = "the field description can't be empty")
    @NotNull(message = "the field description can't be null")
    @JsonProperty("description")
    private String description;
    @NotEmpty(message = "the field address can't be empty")
    @NotNull(message = "the field address can't be null")
    @JsonProperty("address")
    private String address;

}
