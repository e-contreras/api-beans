package py.com.econtreras.api.beans;

import lombok.Data;

import java.math.BigInteger;

@Data
public class WorkOrderProductResponse {
    private Integer id;
    private String productName;
    private Integer taxType;
    private BigInteger price;
}
