package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class SaleInvoiceRequest {

    private Integer id;
    private String invoiceNumber;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime emissionDate;
    private List<SaleInvoiceDetailRequest> detailList;
    private String ringing;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validDate;

}