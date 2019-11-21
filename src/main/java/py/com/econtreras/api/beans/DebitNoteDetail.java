package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebitNoteDetail extends DebitNote implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", required = false)
    private Integer id;
    @JsonProperty(value = "concepto", required = false)
    private String concept;
    @JsonProperty(value = "cant", required = false)
    private int quantity;
    @JsonProperty(value = "tip_impuesto", required = false)
    private int taxeType;
    @JsonProperty(value = "not_debito", required = false)
    private Integer debitNote;

}
