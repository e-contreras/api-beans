package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class CardBean {
    
    private Integer id;
    private String numero;
    private String nombre;
    private Integer fechaExpiracionMes;
    private Integer fechaExpiracionAnho;
    private Integer clienteId;
    
}
