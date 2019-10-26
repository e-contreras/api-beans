package py.com.econtreras.api.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductImageResponse {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("src")
	private String src;
	@JsonProperty("order")
	private String order;
	@JsonProperty("delete")
	private String delete;

}
