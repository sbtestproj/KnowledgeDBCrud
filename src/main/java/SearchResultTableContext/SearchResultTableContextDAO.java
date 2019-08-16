package SearchResultTableContext;

import ConfigItems.ConfigItemsDAO;
import ConfigItems.ConfigItemsEntity;
import ConfigSourceTypes.ConfigSourceTypesEntity;
import ConfigSources.ConfigSourcesEntity;
import ConfigSources.ConfigSourcesEntityDAO;
import Entities.EntitiesEntity;
import ModuleVersions.ModuleVersionsEntity;
import Modules.ModulesEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class SearchResultTableContextDAO {

    private static EntityManagerFactory ef = Persistence.createEntityManagerFactory( "KnowledgeDBCrud" );
    private static EntityManager em = ef.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

    public SearchResultTableContextEntity createTableContextFor(long configItemId){

        SearchResultTableContextEntity aresult = new SearchResultTableContextEntity();
        ConfigItemsDAO ciDao = new ConfigItemsDAO();
        ConfigSourcesEntityDAO csDao = new ConfigSourcesEntityDAO();

        ConfigItemsEntity ci = ciDao.getParameterById(configItemId);
        ConfigSourcesEntity cse = csDao.getParameterSourceById(ci.getConfigSourcesId());
        ConfigSourceTypesEntity cste = csDao.getSourceTypesById(cse.getConfigSourceTypesId());
        ModuleVersionsEntity mve = csDao.getModuleVersionsById(ci.getModuleVersionsId());
        ModulesEntity me = csDao.getModulesById(mve.getModulesId());
        List<EntitiesEntity> entityList = csDao.getEntitiesByModulesId(mve.getModulesId());


        String csename = cse.getConfigSourceName();
        aresult.setConfigSourceName(csename);
        aresult.setSourceTypeName(cste.getConfigSourceTypeName());
        aresult.setCIE(ci);
        aresult.setEntityList(entityList);

        return aresult;
    }

    public moduleResult getModules(long moduleId){

        moduleResult aresult = new moduleResult();
        ConfigItemsDAO ciDao = new ConfigItemsDAO();
        ConfigSourcesEntityDAO csDao = new ConfigSourcesEntityDAO();

        csDao.getModulesById(moduleId);
        csDao.getModuleVersionsByModuleId(moduleId);

        aresult.setModuleName(csDao.getModulesById(moduleId).getModuleName());
        aresult.setModuleVersionsEntity(csDao.getModuleVersionsByModuleId(moduleId));

        return aresult;
    }
}
