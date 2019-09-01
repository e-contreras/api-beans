package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class AddressRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
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
    @JsonProperty("neighborhood_id")
    private Integer neighborhoodId;
    @JsonProperty("person_id")
    private Integer personId;
    
}
