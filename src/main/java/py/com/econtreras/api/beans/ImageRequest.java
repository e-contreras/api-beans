package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class ImageRequest {
	
	private Integer id;
	private byte[] src;
	private int order;
	private int deleted;

}
