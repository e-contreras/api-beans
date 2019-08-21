package py.com.econtreras.api.beans;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Department {

	@JsonProperty("id")
	private Integer id;
	@NotEmpty(message="the field departament_name can't be empty")	
	@NotNull(message="the field departament_name can't be null")
	@JsonProperty("department_name")
	private String departmentName;
	@JsonProperty("creation_date")
	private OffsetDateTime creationDate;
	@JsonProperty("modification_date")
	private OffsetDateTime modificationDate;
	
}
