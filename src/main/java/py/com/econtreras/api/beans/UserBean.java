package py.com.econtreras.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {

    private Integer id;
    private String username;
    private String password;
    private Short enabled;
    private String rol;
    private String name;
    private String lastName;
    private Integer loginFailed;
}
