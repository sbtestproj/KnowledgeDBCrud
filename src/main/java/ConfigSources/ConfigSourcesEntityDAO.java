package ConfigSources;

import ConfigItems.ConfigItemsEntity;
import ConfigSourceTypes.ConfigSourceTypesEntity;
import Entities.EntitiesEntity;
import EntityModuleRelations.EntityModuleRelationsEntity;
import EntityTypes.EntityTypesEntity;
import ModuleVersions.ModuleVersionsEntity;
import Modules.ModulesEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigSourcesEntityDAO {

    private static EntityManagerFactory ef = Persistence.createEntityManagerFactory( "KnowledgeDBCrud" );
    private static EntityManager em = ef.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

    public ConfigSourcesEntity getParameterSourceById(long id){
        ConfigSourcesEntity param;
        param = em.find(ConfigSourcesEntity.class,id);
        return param;
    }

    public ConfigSourceTypesEntity getSourceTypesById(long id){
        ConfigSourceTypesEntity param;
        param = em.find(ConfigSourceTypesEntity.class,id);
        return param;
    }

    public ModuleVersionsEntity getModuleVersionsById(long id){
        ModuleVersionsEntity param;
        param = em.find(ModuleVersionsEntity.class,id);
        return param;
    }

    public List<ModuleVersionsEntity> getModuleVersionsByModuleId(long id){
        Query query = em.createQuery("SELECT c from ModuleVersionsEntity c where c.modulesId =:a");
        query.setParameter("a",id);
        List<ModuleVersionsEntity> elist = query.getResultList();
        return elist;
    }

    public ModulesEntity getModulesById(long id){
        ModulesEntity param;
        param = em.find(ModulesEntity.class,id);
        return param;
    }

    public EntityModuleRelationsEntity getEntityModuleRelationsById(long id){
        EntityModuleRelationsEntity param;
        param = em.find(EntityModuleRelationsEntity.class,id);
        return param;
    }

    public List<EntitiesEntity> getEntitiesByModulesId(long id){

        List<EntityModuleRelationsEntity> listF = getEntityModulerelationsByModulesId(id);
        List<EntitiesEntity> elist = new ArrayList<EntitiesEntity>();

        for (EntityModuleRelationsEntity e: listF){
            Query query = em.createQuery("SELECT c from EntitiesEntity c where c.entitiesId =:a");
            query.setParameter("a",e.getEntities_id());
            EntitiesEntity el = (EntitiesEntity)query.getSingleResult();
            elist.add(el);
        }
        return elist;
    }
    
    public List<EntityModuleRelationsEntity> getEntityModulerelationsByModulesId(long id){
        Query query = em.createQuery("SELECT c from EntityModuleRelationsEntity c where c.modules_id =:a");
        query.setParameter("a",id);
        List<EntityModuleRelationsEntity> elist = query.getResultList();
        return elist;
    }
    public EntityTypesEntity getEntityTypesById(long id){
        EntityTypesEntity param;
        param = em.find(EntityTypesEntity.class,id);
        return param;
    }


}
