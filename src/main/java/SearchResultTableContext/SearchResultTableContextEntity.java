package SearchResultTableContext;

import ConfigItems.ConfigItemsEntity;
import Entities.EntitiesEntity;
import com.sun.istack.internal.Nullable;

import java.util.List;

public class SearchResultTableContextEntity {

    private ConfigItemsEntity CIE;

    private String sourceTypeName;

    private String configSourceName;
    //private String deviceName;

    private List<EntitiesEntity> entityList;

    public List<EntitiesEntity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<EntitiesEntity> entityList) {
        this.entityList = entityList;
    }

    public String getSourceTypeName() {
        return sourceTypeName;
    }

    public void setSourceTypeName(String sourceTypeName) {
        this.sourceTypeName = sourceTypeName;
    }

    public ConfigItemsEntity getCIE() {
        return CIE;
    }

    public void setCIE(ConfigItemsEntity CIE) {
        this.CIE = CIE;
    }

    public String getConfigSourceName() {
        return configSourceName;
    }

    public void setConfigSourceName(String configSourceName) {
        this.configSourceName = configSourceName;
    }

//    public String getDeviceName() {
//        return deviceName;
//    }
//
//    public void setDeviceName(String deviceName) {
//        this.deviceName = deviceName;
//    }
}
