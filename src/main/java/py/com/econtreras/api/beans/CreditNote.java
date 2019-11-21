package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditNote implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty(value = "id", required = false)
    private Integer id;
    @JsonProperty(value = "num_doc_relacionado", required = false)
    private String relatedDocument;
    @JsonProperty(value = "comentario", required = false)
    private String comment;
    @JsonProperty(value = "timbrado", required = false)
    private Integer idTimbrado;
    @JsonProperty(value = "destinatario", required = false)
    private Integer idDestinatario;
    @JsonProperty(value = "fec_emision", required = false)
    private Date emisionDate;
}
