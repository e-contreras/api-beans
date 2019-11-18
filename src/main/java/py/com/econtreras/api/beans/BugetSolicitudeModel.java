package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime initDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime endDate;
    private String state;
    private List<ProductBean> productList;
    private String description;

}
