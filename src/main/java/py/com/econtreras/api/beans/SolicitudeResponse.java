package py.com.econtreras.api.beans;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudeResponse {

    private Integer id;
    private Date creationDate;
    private Date confirmationDate;
    private List<Productstore> ProductBeanList;
    private String status;
    private UserBean cliente;
    
}
