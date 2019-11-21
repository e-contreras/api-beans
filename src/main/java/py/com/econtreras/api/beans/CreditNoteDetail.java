package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditNoteDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", required = false)
    private Integer id;
    @JsonProperty(value = "concepto", required = false)
    private String concept;
    @JsonProperty(value = "cant", required = false)
    private int quantity;
    @JsonProperty(value = "monto", required = false)
    private double amount;
    @JsonProperty(value = "tip_impuesto", required = false)
    private int taxeTaype;
    @JsonProperty(value = "not_credito", required = false)
    private Integer idCreditNote;
    
}
