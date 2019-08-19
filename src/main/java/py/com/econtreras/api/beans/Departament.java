package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Departament {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("departament_name")
	private String departamentName;
}
