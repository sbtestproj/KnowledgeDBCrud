package EntityTypes;

import javax.persistence.*;

@Entity
@Table(name = "entity_types", schema = "public", catalog = "example")
public class EntityTypesEntity {
    private long entityTypesId;
    private String entityTypeName;

    @Id
    @Column(name = "entity_types_id", nullable = false)
    public long getEntityTypesId() {
        return entityTypesId;
    }

    public void setEntityTypesId(long entityTypesId) {
        this.entityTypesId = entityTypesId;
    }

    @Basic
    @Column(name = "entity_type_name", nullable = false, length = 250)
    public String getEntityTypeName() {
        return entityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityTypesEntity that = (EntityTypesEntity) o;

        if (entityTypesId != that.entityTypesId) return false;
        if (entityTypeName != null ? !entityTypeName.equals(that.entityTypeName) : that.entityTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (entityTypesId ^ (entityTypesId >>> 32));
        result = 31 * result + (entityTypeName != null ? entityTypeName.hashCode() : 0);
        return result;
    }
}
