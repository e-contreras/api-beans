package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class ImageRequest {
	
	private Integer id;
	private String src;
	private int order;
	private int deleted;

}
