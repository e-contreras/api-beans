package py.com.econtreras.api.beans;

import lombok.Data;

import java.util.List;

@Data
public class CartBean {

    private List<CartProductBean> cartProductBeanList;
    private Integer solicitudeId;
    private String status;
    private Integer client;


}
