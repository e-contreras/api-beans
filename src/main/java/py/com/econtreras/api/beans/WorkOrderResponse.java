package py.com.econtreras.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkOrderResponse {

    private Integer id;
    private LocalDateTime creationDate;
    private LocalDateTime assignment;
    private String Status;
    private List<WorkOrderProductResponse> productResponseList;

}
