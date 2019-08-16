package EntityModuleRelations;

import javax.persistence.*;

@Entity
@Table(name = "entity_module_relations", schema = "public", catalog = "example")
public class EntityModuleRelationsEntity {
    private long id;
    private long entities_id;
    private long modules_id;


    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entities_id", nullable = false)
    public long getEntities_id() {
        return entities_id;
    }

    public void setEntities_id(long entities_id) {
        this.entities_id = entities_id;
    }

    @Basic
    @Column(name = "modules_id", nullable = false)
    public long getModules_id() {
        return modules_id;
    }

    public void setModules_id(long modules_id) {
        this.modules_id = modules_id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityModuleRelationsEntity that = (EntityModuleRelationsEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
