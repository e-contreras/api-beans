package py.com.econtreras.api.beans;

import lombok.Data;

@Data
public class ProductImageRequest {

    private Character principal;
    private ImageRequest imagen;
    private ProductRequest product;

}
