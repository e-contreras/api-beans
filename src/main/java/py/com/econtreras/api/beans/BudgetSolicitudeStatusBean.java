package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class BudgetSolicitudeStatusBean {

    private Integer id;
    private String status;
    private boolean deleted;

}
