package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressResponse extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer addressId;
    @JsonProperty("cal_principal")
    private String principalStreet;
    @JsonProperty("cal_secundaria")
    private String secondaryStreet;
    @JsonProperty("number")
    private String number;
    @JsonProperty("building")
    private String building;
    @JsonProperty("floor")
    private String floor;
    @JsonProperty("apartment")
    private String apartment;
    @JsonProperty("address_type")
    private String addressType;
    
}
