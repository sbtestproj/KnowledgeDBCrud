package ConfigSourceTypes;

import javax.persistence.*;

@Entity
@Table(name = "config_source_types", schema = "public", catalog = "example")
public class ConfigSourceTypesEntity {
    private long configSourceTypesId;
    private String configSourceTypeName;

    @Id
    @Column(name = "config_source_types_id", nullable = false)
    public long getConfigSourceTypesId() {
        return configSourceTypesId;
    }

    public void setConfigSourceTypesId(long configSourceTypesId) {
        this.configSourceTypesId = configSourceTypesId;
    }

    @Basic
    @Column(name = "config_source_type_name", nullable = false, length = 250)
    public String getConfigSourceTypeName() {
        return configSourceTypeName;
    }

    public void setConfigSourceTypeName(String configSourceTypeName) {
        this.configSourceTypeName = configSourceTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigSourceTypesEntity that = (ConfigSourceTypesEntity) o;

        if (configSourceTypesId != that.configSourceTypesId) return false;
        if (configSourceTypeName != null ? !configSourceTypeName.equals(that.configSourceTypeName) : that.configSourceTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configSourceTypesId ^ (configSourceTypesId >>> 32));
        result = 31 * result + (configSourceTypeName != null ? configSourceTypeName.hashCode() : 0);
        return result;
    }
}
