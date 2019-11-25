package py.com.econtreras.api.beans;

import java.util.Date;
import lombok.Data;

@Data
public class WorkOrderRequest {

    private Integer id;
    private Date creationDate;
    private String asignation;
    private Integer solicitude;
    private Integer status;
    private Integer transfer;
    private Integer wareHousePersonal;
    private Integer driver;
    private Integer vehicle;
    private Integer warehouse;
    
}
