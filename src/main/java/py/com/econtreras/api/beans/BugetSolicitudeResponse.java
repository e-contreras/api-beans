package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BugetSolicitudeResponse {

    private Integer id;
    private String description;
    private String category;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime initDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;
    private String status;

}
