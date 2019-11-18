package py.com.econtreras.api.beans;

import lombok.Data;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SolicitudBean {

    private Integer id;
    private LocalDateTime creationDate;
    private LocalDateTime confirmationDate;
    private List<ProductBean> ProductBeanList;
    private String status;

}
