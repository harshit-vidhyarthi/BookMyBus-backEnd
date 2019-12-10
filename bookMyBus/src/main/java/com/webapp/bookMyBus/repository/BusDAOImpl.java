package com.webapp.bookMyBus.repository;

import com.webapp.bookMyBus.dto.BusDTO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

@Repository
public class BusDAOImpl implements BusDAO {

    private EntityManager entityManager;

    @Autowired
    public BusDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<BusDTO> findBuses(String source, String destination, Date date) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query query = currentSession.createSQLQuery(
                "SELECT" +
                        " j.start_date, j.end_date, j.available_seats," +
                        " b.total_seats, b.rating," +
                        " tc.name," +
                        " r.distance," +
                        " ss.name," +
                        " sd.name," +
                " FROM journey j" +
                " INNER JOIN bus b" +
                    " ON j.bus_id = b.bid" +
                " INNER JOIN travel_company tc" +
                    " ON b.company_id = tc.cid" +
                " INNER JOIN route r" +
                    " ON r.rid = j.route_id" +
                " INNER JOIN stop ss" +
                    " ON ss.sid = r.source_stopid" +
                " INNER JOIN stop sd" +
                    " ON sd.sid = r.destination_stopid" +
                " WHERE ss.name = :source" +
                " AND sd.name = :destination" +
                " AND j.start_date := date");

        query.setParameter("source", source);
        query.setParameter("destination", destination);
        query.setParameter("date", date);

        List busResultsList = query.getResultList();
        List <BusDTO> busResults = new ArrayList<>(); ;

        ListIterator it = busResultsList.listIterator();
        long id=1;
        while(it.hasNext()) {
            Object obj[] = (Object[]) it.next();
            BusDTO singleResult = new BusDTO(id, (String)obj[7], (String)obj[8], (String)obj[6], (int)obj[2], (int)obj[3], (String)obj[4], (String)obj[5], (Date)obj[0], (Date)obj[1]);
            id++;
            busResults.add(singleResult);
        }
        return busResults;
    }
}
