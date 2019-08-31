package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
    @NotEmpty(message = "the field brand can't be empty")
    @NotNull(message = "the field brand can't be null")
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("model")
    private String model;
    @JsonProperty("color")
    private String color;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("capacity")
    private String capacity;
    @JsonProperty("document_number")
    private String documentNumber;
    @JsonProperty("plate")
    private String plate;
    @JsonProperty("chassis")
    private String chassis;

}
