package SearchResultTableContext;

import ModuleVersions.ModuleVersionsEntity;

import java.util.List;

public class moduleResult {
    String moduleName;
    List<ModuleVersionsEntity> moduleVersionsEntity;
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<ModuleVersionsEntity> getModuleVersionsEntity() {
        return moduleVersionsEntity;
    }

    public void setModuleVersionsEntity(List<ModuleVersionsEntity> moduleVersionsEntity) {
        this.moduleVersionsEntity = moduleVersionsEntity;
    }
}
