package ConfigItems;

import ConfigSources.ConfigSourcesEntity;
import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import java.util.List;

public class ConfigItemsDAO {

    private static EntityManagerFactory ef = Persistence.createEntityManagerFactory( "KnowledgeDBCrud" );
    private static EntityManager em = ef.createEntityManager();
    private static EntityTransaction et = em.getTransaction();

    public List<ConfigItemsEntity> getAllParameters(){

        String strQuery = "SELECT c FROM ConfigItemsEntity c WHERE c.configItemsId IS NOT NULL";
        TypedQuery<ConfigItemsEntity> tq = em.createQuery(strQuery, ConfigItemsEntity.class);
        List<ConfigItemsEntity> params;
        params = tq.getResultList();
        if(params == null)
        {
            System.out.println("There is no Parameter");
        }
        return params;
    }

    public ConfigItemsEntity getParameterById(long id){
        ConfigItemsEntity param;
        param = em.find(ConfigItemsEntity.class,id);
        return param;
    }

    public List<ConfigItemsEntity> searchParamViaRefDescription(String searchStr){

        Query query = em.createQuery("SELECT c from ConfigItemsEntity c where c.referenceDescription like '%'||:SearchSt||'%'");
        query.setParameter("SearchSt",searchStr);
        List<ConfigItemsEntity> params;
        params = query.getResultList();

        return params;
    }

    public List<ConfigItemsEntity> searchParamViaConfDescription(String searchStr){

        Query query = em.createQuery("SELECT c from ConfigItemsEntity c where c.configItemDescription like '%'||:SearchSt||'%'");
        query.setParameter("SearchSt",searchStr);
        List<ConfigItemsEntity> params;
        params = query.getResultList();

        return params;
    }


    public List<ConfigItemsEntity> searchParamViaName(String searchStr){

        Query query = em.createQuery("SELECT c from ConfigItemsEntity c where c.configItemName like '%'||:SearchSt||'%'");
        query.setParameter("SearchSt",searchStr);
        List<ConfigItemsEntity> params;
        params = query.getResultList();

        return params;
    }

//    public void updateParameter(int paramID, @Nullable String newName, @Nullable String newDefinition,@Nullable String newMax,@Nullable String newMin){
//        ConfigItemsEntity param = getParameterById(paramID);
//        ConfigItemsEntity p = param;
//        if(newName != null) {
//            param.setConfigItemName(newName);
//        }
//        if(newDefinition != null) {
//            param.setConfigItemDescription(newDefinition);
//        }
//        if(newMin != null) {
//            param.setMinValue(newMin);
//        }
//        if(newMax != null) {
//            param.setMaxValue(newMax);
//        }
//        param.setOrdinalPosition(15);
//        et.begin();
//        em.merge(param);
//        et.commit();
//        //et.rollback();
//    }

    public ConfigItemsEntity getParamByName(String paramName){

        ConfigItemsEntity p = new ConfigItemsEntity();
        List<ConfigItemsEntity> params = searchParamViaName(paramName);
        for (ConfigItemsEntity param:params)
        {
            if(param.getConfigItemName().matches(paramName)){
                p=param;
            }
        }
        return p;
    }

    public void deleteParameterByName(String paramName){
        ConfigItemsEntity p = getParamByName(paramName);

        et.begin();
        em.remove(p);
        et.commit();
        //et.rollback();
    }

    public void deleteParameterById(int id){
        ConfigItemsEntity p = getParameterById(id);
        if(p != null) {
            et.begin();
            em.remove(p);
            et.commit();
        }
        else{
            System.out.println("We dont have this object");
        }
        //et.rollback();
    }


    public void addParameter(String paramName, @Nullable String paramDef, @Nullable String paramMax, @Nullable String paramMin)
    {
        ConfigItemsEntity newParam = new ConfigItemsEntity();

        newParam.setIgnoreFlag(true);
        newParam.setDynamicFlag(false);
        newParam.setVerifiedByExpert(true);
        newParam.setConfigItemName(paramName);
        newParam.setConfigItemDescription(paramDef);
        newParam.setMinValue(paramMin);
        newParam.setMaxValue(paramMax);

        et.begin();
        try {
            em.persist(newParam);
            et.commit();
        }
        catch (Exception e){
            System.out.println(e);
        }
        //et.rollback();
    }

//    public ConfigSourcesEntity()

}
