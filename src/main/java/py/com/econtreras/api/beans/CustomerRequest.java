package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerRequest extends PersonRequest implements Serializable{

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Integer id;
}
