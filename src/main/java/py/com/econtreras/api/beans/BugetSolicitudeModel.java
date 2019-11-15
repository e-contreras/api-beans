package py.com.econtreras.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BugetSolicitudeModel {

    private Integer id;
    private String name;
    private String category;
    private LocalDateTime initDate;
    private LocalDateTime endDate;
    private String state;
    private List<ProductBean> productList;
    private String description;

}
