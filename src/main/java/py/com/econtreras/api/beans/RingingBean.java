/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.econtreras.api.beans;

import java.time.LocalDate;
import lombok.Data;

@Data
public class RingingBean {
    
    private Integer id;
    private String ringing;
    private LocalDate validityDate;
    private String documentType;
    
}
