package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebitNote implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", required = false)
    private Integer id;
    
    @JsonProperty(value = "num_documento", required = false)
    private String documentNumber;
    
    @JsonProperty(value = "num_doc_relacionado", required = false)
    private String relatedDocument;
    
    @JsonProperty(value = "comentario", required = false)
    private String comment;
    
    @JsonProperty(value = "remitente", required = false)
    private UserBean sender;

}
