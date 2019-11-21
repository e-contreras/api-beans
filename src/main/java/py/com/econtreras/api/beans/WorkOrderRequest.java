package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class WorkOrderRequest {
    private String Id;
    private String personalId;
    private String personalName;
    private String personalLastName;
    private String solicitudId;
    private String status;
}
