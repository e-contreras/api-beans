package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class SaleInvoiceDetailRequest {

    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private Integer taxtType;

}
