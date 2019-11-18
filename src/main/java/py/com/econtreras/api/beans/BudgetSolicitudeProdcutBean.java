package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class BudgetSolicitudeProdcutBean {

    private int bugetSolicitudeProdcutId;
    private int productId;
    private String productName;
    private int quantity;
    private int taxeType;

}
