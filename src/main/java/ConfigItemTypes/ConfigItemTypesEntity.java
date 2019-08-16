package ConfigItemTypes;

import javax.persistence.*;

@Entity
@Table(name = "config_item_types", schema = "public", catalog = "example")
public class ConfigItemTypesEntity {
    private long configItemTypesId;
    private String configItemTypeName;

    @Id
    @Column(name = "config_item_types_id", nullable = false)
    public long getConfigItemTypesId() {
        return configItemTypesId;
    }

    public void setConfigItemTypesId(long configItemTypesId) {
        this.configItemTypesId = configItemTypesId;
    }

    @Basic
    @Column(name = "config_item_type_name", nullable = false, length = 250)
    public String getConfigItemTypeName() {
        return configItemTypeName;
    }

    public void setConfigItemTypeName(String configItemTypeName) {
        this.configItemTypeName = configItemTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigItemTypesEntity that = (ConfigItemTypesEntity) o;

        if (configItemTypesId != that.configItemTypesId) return false;
        if (configItemTypeName != null ? !configItemTypeName.equals(that.configItemTypeName) : that.configItemTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configItemTypesId ^ (configItemTypesId >>> 32));
        result = 31 * result + (configItemTypeName != null ? configItemTypeName.hashCode() : 0);
        return result;
    }
}
