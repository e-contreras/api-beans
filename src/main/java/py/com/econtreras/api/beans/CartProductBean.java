package py.com.econtreras.api.beans;

import lombok.Data;

import java.math.BigInteger;

@Data
public class CartProductBean {

    private Integer cartId;
    private Integer ProductId;
    private BigInteger price;
    private Integer quantity;

}
