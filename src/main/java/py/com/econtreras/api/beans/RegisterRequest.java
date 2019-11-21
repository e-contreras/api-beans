/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.econtreras.api.beans;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    
    private String username;
    private String password;
    private Integer roleId;
    private String name;
    private String lastName;
    private String documentNumber;
    private Integer documentType;
    private Integer personType;
    private LocalDate birthday;
    private String email;
    private String phone;
    private String cellphone;
    
}
