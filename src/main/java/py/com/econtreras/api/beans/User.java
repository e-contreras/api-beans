package py.com.econtreras.api.beans;
import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("last_name")
	private String lastname;
	@JsonProperty("age")
	private Calendar age;
	@JsonProperty("email")
	private String email;
	@JsonProperty("phone_number")
	private String phoneNumber;
	@JsonProperty("cell_phone")
	private String cellPhone;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("password")
	private String password;
	@JsonProperty("registry_date")
	private Calendar registryDate;
	@JsonProperty("delete")
	private Boolean delete;

}