package ConfigItems;

import javax.persistence.*;

@Entity
@Table(name = "config_items", schema = "public", catalog = "example")
public class ConfigItemsEntity {

    private long configItemsId;
    private long configItemTypesId;
    private long configSourcesId;
    private long moduleVersionsId;
    private long dataTypesId;
    private String configItemName;
    private String minValue;
    private String maxValue;
    private String defaultValue;
    private String configItemDescription;
    private String referenceDescription;
    private Integer columnOrdinalPosition;
    private Boolean isNullable;
    private boolean verifiedByExpert;
    private boolean dynamicFlag;
    private boolean ignoreFlag;
    private Boolean isPrimaryKey;
    private Boolean isForeignKey;
    private Boolean readOnlyFlag;

    @Id
    @Column(name = "config_items_id", nullable = false)
    public long getConfigItemsId() {
        return configItemsId;
    }

    public void setConfigItemsId(long configItemsId) {
        this.configItemsId = configItemsId;
    }

    @Basic
    @Column(name = "module_versions_id", nullable = false)
    public long getModuleVersionsId() {
        return moduleVersionsId;
    }

    public void setModuleVersionsId(long moduleVersionsId) {
        this.moduleVersionsId = moduleVersionsId;
    }

    @Basic
    @Column(name = "config_sources_id", nullable = false)
    public long getConfigSourcesId() {
        return configSourcesId;
    }

    public void setConfigSourcesId(long configSourcesId) {
        this.configSourcesId = configSourcesId;
    }

    @Basic
    @Column(name = "data_types_id", nullable = false)
    public long getDataTypesId() {
        return dataTypesId;
    }

    public void setDataTypesId(long dataTypesId) {
        this.dataTypesId = dataTypesId;
    }
    @Basic
    @Column(name = "config_item_types_id", nullable = false)
    public long getConfigItemTypesId() {
        return configItemTypesId;
    }
    public void setConfigItemTypesId(long configItemTypesId) {
        this.configItemTypesId = configItemTypesId;
    }

    @Basic
    @Column(name = "config_item_name", nullable = false, length = 250)
    public String getConfigItemName() {
        return configItemName;
    }

    public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName;
    }

    @Basic
    @Column(name = "min_value", nullable = true, length = 250)
    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @Basic
    @Column(name = "max_value", nullable = true, length = 250)
    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @Basic
    @Column(name = "default_value", nullable = true, length = 250)
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Basic
    @Column(name = "config_item_description", nullable = true, length = 500)
    public String getConfigItemDescription() {
        return configItemDescription;
    }

    public void setConfigItemDescription(String configItemDescription) {
        this.configItemDescription = configItemDescription;
    }

    @Basic
    @Column(name = "reference_description", nullable = true, length = 500)
    public String getReferenceDescription() {
        return referenceDescription;
    }

    public void setReferenceDescription(String referenceDescription) {
        this.referenceDescription = referenceDescription;
    }

    @Basic
    @Column(name = "column_ordinal_position", nullable = true)
    public Integer getColumnOrdinalPosition() {
        return columnOrdinalPosition;
    }

    public void setColumnOrdinalPosition(Integer columnOrdinalPosition) {
        this.columnOrdinalPosition = columnOrdinalPosition;
    }

    @Basic
    @Column(name = "is_nullable", nullable = true)
    public Boolean getNullable() {
        return isNullable;
    }

    public void setNullable(Boolean nullable) {
        isNullable = nullable;
    }

    @Basic
    @Column(name = "verified_by_expert", nullable = false)
    public boolean isVerifiedByExpert() {
        return verifiedByExpert;
    }

    public void setVerifiedByExpert(boolean verifiedByExpert) {
        this.verifiedByExpert = verifiedByExpert;
    }

    @Basic
    @Column(name = "dynamic_flag", nullable = false)
    public boolean isDynamicFlag() {
        return dynamicFlag;
    }

    public void setDynamicFlag(boolean dynamicFlag) {
        this.dynamicFlag = dynamicFlag;
    }

    @Basic
    @Column(name = "ignore_flag", nullable = false)
    public boolean isIgnoreFlag() {
        return ignoreFlag;
    }

    public void setIgnoreFlag(boolean ignoreFlag) {
        this.ignoreFlag = ignoreFlag;
    }

    @Basic
    @Column(name = "is_primary_key", nullable = true)
    public Boolean getPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }

    @Basic
    @Column(name = "is_foreign_key", nullable = true)
    public Boolean getForeignKey() {
        return isForeignKey;
    }

    public void setForeignKey(Boolean foreignKey) {
        isForeignKey = foreignKey;
    }

    @Basic
    @Column(name = "read_only_flag", nullable = true)
    public Boolean getReadOnlyFlag() {
        return readOnlyFlag;
    }

    public void setReadOnlyFlag(Boolean readOnlyFlag) {
        this.readOnlyFlag = readOnlyFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigItemsEntity that = (ConfigItemsEntity) o;

        if (configItemsId != that.configItemsId) return false;
        if (verifiedByExpert != that.verifiedByExpert) return false;
        if (dynamicFlag != that.dynamicFlag) return false;
        if (ignoreFlag != that.ignoreFlag) return false;
        if (configItemName != null ? !configItemName.equals(that.configItemName) : that.configItemName != null)
            return false;
        if (minValue != null ? !minValue.equals(that.minValue) : that.minValue != null) return false;
        if (maxValue != null ? !maxValue.equals(that.maxValue) : that.maxValue != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
        if (configItemDescription != null ? !configItemDescription.equals(that.configItemDescription) : that.configItemDescription != null)
            return false;
        if (referenceDescription != null ? !referenceDescription.equals(that.referenceDescription) : that.referenceDescription != null)
            return false;
        if (columnOrdinalPosition != null ? !columnOrdinalPosition.equals(that.columnOrdinalPosition) : that.columnOrdinalPosition != null)
            return false;
        if (isNullable != null ? !isNullable.equals(that.isNullable) : that.isNullable != null) return false;
        if (isPrimaryKey != null ? !isPrimaryKey.equals(that.isPrimaryKey) : that.isPrimaryKey != null) return false;
        if (isForeignKey != null ? !isForeignKey.equals(that.isForeignKey) : that.isForeignKey != null) return false;
        if (readOnlyFlag != null ? !readOnlyFlag.equals(that.readOnlyFlag) : that.readOnlyFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configItemsId ^ (configItemsId >>> 32));
        result = 31 * result + (configItemName != null ? configItemName.hashCode() : 0);
        result = 31 * result + (minValue != null ? minValue.hashCode() : 0);
        result = 31 * result + (maxValue != null ? maxValue.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        result = 31 * result + (configItemDescription != null ? configItemDescription.hashCode() : 0);
        result = 31 * result + (referenceDescription != null ? referenceDescription.hashCode() : 0);
        result = 31 * result + (columnOrdinalPosition != null ? columnOrdinalPosition.hashCode() : 0);
        result = 31 * result + (isNullable != null ? isNullable.hashCode() : 0);
        result = 31 * result + (verifiedByExpert ? 1 : 0);
        result = 31 * result + (dynamicFlag ? 1 : 0);
        result = 31 * result + (ignoreFlag ? 1 : 0);
        result = 31 * result + (isPrimaryKey != null ? isPrimaryKey.hashCode() : 0);
        result = 31 * result + (isForeignKey != null ? isForeignKey.hashCode() : 0);
        result = 31 * result + (readOnlyFlag != null ? readOnlyFlag.hashCode() : 0);
        return result;
    }
}
