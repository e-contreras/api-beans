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
public class RoleResponse extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("id")
    private Integer roleId;
    @JsonProperty("description")
    private String description;
}
