package ConfigSources;

import javax.persistence.*;

@Entity
@Table(name = "config_sources", schema = "public", catalog = "example")
public class ConfigSourcesEntity {
    private long configSourcesId;
    private long configSourceTypesId;
    private String configSourceName;
    private String configSourceLocation;
    private String configSourceDescription;

    @Id
    @Column(name = "config_sources_id", nullable = false)
    public long getConfigSourcesId() {
        return configSourcesId;
    }

    public void setConfigSourcesId(long configSourcesId) {
        this.configSourcesId = configSourcesId;
    }

    @Basic
    @Column(name = "config_source_types_id", nullable = false)
    public long getConfigSourceTypesId() {
        return configSourceTypesId;
    }
    public void setConfigSourceTypesId(long configSourceTypesId) {
        this.configSourceTypesId = configSourceTypesId;
    }

    @Basic
    @Column(name = "config_source_name", nullable = false, length = 250)
    public String getConfigSourceName() {
        return configSourceName;
    }

    public void setConfigSourceName(String configSourceName) {
        this.configSourceName = configSourceName;
    }

    @Basic
    @Column(name = "config_source_location", nullable = true, length = 500)
    public String getConfigSourceLocation() {
        return configSourceLocation;
    }

    public void setConfigSourceLocation(String configSourceLocation) {
        this.configSourceLocation = configSourceLocation;
    }

    @Basic
    @Column(name = "config_source_description", nullable = true, length = 500)
    public String getConfigSourceDescription() {
        return configSourceDescription;
    }

    public void setConfigSourceDescription(String configSourceDescription) {
        this.configSourceDescription = configSourceDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigSourcesEntity that = (ConfigSourcesEntity) o;

        if (configSourcesId != that.configSourcesId) return false;
        if (configSourceName != null ? !configSourceName.equals(that.configSourceName) : that.configSourceName != null)
            return false;
        if (configSourceLocation != null ? !configSourceLocation.equals(that.configSourceLocation) : that.configSourceLocation != null)
            return false;
        if (configSourceDescription != null ? !configSourceDescription.equals(that.configSourceDescription) : that.configSourceDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configSourcesId ^ (configSourcesId >>> 32));
        result = 31 * result + (configSourceName != null ? configSourceName.hashCode() : 0);
        result = 31 * result + (configSourceLocation != null ? configSourceLocation.hashCode() : 0);
        result = 31 * result + (configSourceDescription != null ? configSourceDescription.hashCode() : 0);
        return result;
    }
}
