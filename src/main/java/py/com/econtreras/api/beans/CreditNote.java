package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CreditNote implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", required = false)
    private Integer id;
    
    @JsonProperty(value = "num_doc_relacionado", required = false)
    private String relatedDocument;
    
    @JsonProperty(value = "comentario", required = false)
    private String comment;
    
    @JsonProperty(value = "timbrado", required = false)
    private RingingBean ringing;
    
    @JsonProperty(value = "destinatario", required = false)
    private UserBean destinatario;
    
    @JsonProperty(value = "fec_emision", required = false)
    private Date emisionDate;
}
