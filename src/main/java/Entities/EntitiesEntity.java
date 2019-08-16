package Entities;

import javax.persistence.*;

@Entity
@Table(name = "entities", schema = "public", catalog = "example")
public class EntitiesEntity {
    private long entitiesId;
    private long entityTypeId;
    private String entityName;

    @Id
    @Column(name = "entities_id", nullable = false)
    public long getEntitiesId() {
        return entitiesId;
    }

    public void setEntitiesId(long entitiesId) {
        this.entitiesId = entitiesId;
    }

    @Basic
    @Column(name = "entity_types_id", nullable = false)
    public long getEntityTypeId(){ return entityTypeId;}
    public void setEntityTypeId(long entityTypeId){this.entityTypeId=entityTypeId;}

    @Basic
    @Column(name = "entity_name", nullable = false, length = 250)
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntitiesEntity that = (EntitiesEntity) o;

        if (entitiesId != that.entitiesId) return false;
        if (entityName != null ? !entityName.equals(that.entityName) : that.entityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (entitiesId ^ (entitiesId >>> 32));
        result = 31 * result + (entityName != null ? entityName.hashCode() : 0);
        return result;
    }
}
