package Modules;

import javax.persistence.*;

@Entity
@Table(name = "modules", schema = "public", catalog = "example")
public class ModulesEntity {
    private long modulesId;
    private String moduleName;
    private String moduleDescription;
    private String responsiblePerson;

    @Id
    @Column(name = "modules_id", nullable = false)
    public long getModulesId() {
        return modulesId;
    }

    public void setModulesId(long modulesId) {
        this.modulesId = modulesId;
    }

    @Basic
    @Column(name = "module_name", nullable = false, length = 250)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Basic
    @Column(name = "module_description", nullable = true, length = 500)
    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    @Basic
    @Column(name = "responsible_person", nullable = false, length = 100)
    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModulesEntity that = (ModulesEntity) o;

        if (modulesId != that.modulesId) return false;
        if (moduleName != null ? !moduleName.equals(that.moduleName) : that.moduleName != null) return false;
        if (moduleDescription != null ? !moduleDescription.equals(that.moduleDescription) : that.moduleDescription != null)
            return false;
        if (responsiblePerson != null ? !responsiblePerson.equals(that.responsiblePerson) : that.responsiblePerson != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (modulesId ^ (modulesId >>> 32));
        result = 31 * result + (moduleName != null ? moduleName.hashCode() : 0);
        result = 31 * result + (moduleDescription != null ? moduleDescription.hashCode() : 0);
        result = 31 * result + (responsiblePerson != null ? responsiblePerson.hashCode() : 0);
        return result;
    }
}
