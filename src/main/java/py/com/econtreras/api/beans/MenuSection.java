package py.com.econtreras.api.beans;

import lombok.Data;

import java.util.List;

@Data
public class MenuSection {
    private String name;
    private String icon;
    private List<MenuResponse> menues;
}
