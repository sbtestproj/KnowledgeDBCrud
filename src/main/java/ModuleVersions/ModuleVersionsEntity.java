package ModuleVersions;

import javax.persistence.*;

@Entity
@Table(name = "module_versions", schema = "public", catalog = "example")
public class ModuleVersionsEntity {
    private long moduleVersionsId;
    private long modulesId;
    private String versionNumber;

    @Id
    @Column(name = "module_versions_id", nullable = false)
    public long getModuleVersionsId() {
        return moduleVersionsId;
    }

    public void setModuleVersionsId(long moduleVersionsId) {
        this.moduleVersionsId = moduleVersionsId;
    }

    @Basic
    @Column(name = "modules_id", nullable = false)
    public long getModulesId() {
        return modulesId;
    }

    public void setModulesId(long modulesId) {
        this.modulesId = modulesId;
    }

    @Basic
    @Column(name = "version_number", nullable = false, length = 100)
    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModuleVersionsEntity that = (ModuleVersionsEntity) o;

        if (moduleVersionsId != that.moduleVersionsId) return false;
        if (modulesId != that.modulesId) return false;
        if (versionNumber != null ? !versionNumber.equals(that.versionNumber) : that.versionNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (moduleVersionsId ^ (moduleVersionsId >>> 32));
        result = 31 * result + (int) (modulesId ^ (modulesId >>> 32));
        result = 31 * result + (versionNumber != null ? versionNumber.hashCode() : 0);
        return result;
    }
}
