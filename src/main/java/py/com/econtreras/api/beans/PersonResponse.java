package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonResponse extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer personId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("business_name")
    private String businessName;
    @JsonProperty("document_number")
    private String documentNumber;
    @JsonProperty("birthday")
    private LocalDate birthday;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("cellphone")
    private String cellphone;
    
}
