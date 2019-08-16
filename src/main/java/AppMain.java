
import javax.persistence.*;
import java.util.List;
import ConfigItems.ConfigItemsDAO;
import ConfigItems.ConfigItemsEntity;
import ConfigSources.ConfigSourcesEntity;
import ConfigSources.ConfigSourcesEntityDAO;
import Entities.EntitiesEntity;
import SearchResultTableContext.SearchResultTableContextDAO;
import SearchResultTableContext.SearchResultTableContextEntity;

public class AppMain {

    //private static EntityManagerFactory ef = Persistence.createEntityManagerFactory("hibernateCRUD3");

    public static void main(String[] args) {

        EntityManagerFactory ef = Persistence.createEntityManagerFactory( "KnowledgeDBCrud" );
        EntityManager em = ef.createEntityManager();
        EntityTransaction et = em.getTransaction();
        EntitiesEntity param;
        long i = 2;

//        Query query = em.createQuery("SELECT c from EntitiesEntity c where c.entityTypeId =:a ");
//        query.setParameter("a",i);
//        List<EntitiesEntity> elist = query.getResultList();

        ConfigItemsDAO paramdao = new ConfigItemsDAO();
        ConfigSourcesEntityDAO psdao = new ConfigSourcesEntityDAO();
        SearchResultTableContextDAO srtDao = new SearchResultTableContextDAO();

        SearchResultTableContextEntity srtce;

        srtDao.getModules(1);
        srtDao.createTableContextFor(i);


        ConfigSourcesEntity cse;
        ConfigItemsEntity cie;

        cie = paramdao.getParameterById(2);

        cse = psdao.getParameterSourceById(cie.getConfigItemTypesId());



        System.out.println(cse);


//        long i = 4;

//
//        ConfigItemsEntity c = paramdao.getParameterById(i);
//
//        List<ConfigitemsEntity> allparams = paramdao.searchParamViaName("a");
//
//        paramdao.addParameter("saat onda eklendi","saat on kırkiki","25.65","27.8");
//
        List<ConfigItemsEntity> allparams2 = paramdao.getAllParameters();
//
//        List<ConfigitemsEntity> params = paramdao.searchParamViaName("o");
//
//        ConfigitemsEntity p = paramdao.getParameterById(5);
//
//        paramdao.updateParameter(5,"yeniad",null,null,null);
//
//        paramdao.deleteParameterById(11);
//
//        paramdao.deleteParameterByName("saat onda eklendi");
//
//        List<ConfigitemsEntity> allparams3 = paramdao.getAllParameters();
//
//        System.out.println(params);
        System.out.println(allparams2);
    }
}
