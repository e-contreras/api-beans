package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PersonRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("business_name")
    private String businessName;
    @JsonProperty("document_number")
    private String documentNumber;
    @JsonProperty("birthday")
    private Date birthday;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("cellphone")
    private String cellphone;
    @JsonProperty("document_type_id")
    private Integer documentTypeId;
    @JsonProperty("person_type_id")
    private Integer personTypeId;
    
}
