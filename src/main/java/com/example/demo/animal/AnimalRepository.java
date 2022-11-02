package com.example.demo.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByName(String name);

    //funkcja z zapytaniem zwracającym strefy z największym zapotrzebowaniem na karmę
    @Query(value = " SELECT zone FROM (SELECT zone, MAX(sum_feed) AS max_feed FROM (SELECT zone_id AS zone, SUM(feed_quantity) " +
            "AS sum_feed FROM animal GROUP BY zone_id) GROUP BY zone) WHERE max_feed = (SELECT MAX(sum_feed) AS max_feed FROM (SELECT zone_id AS zone, SUM(feed_quantity) " +
            "AS sum_feed FROM animal GROUP BY zone_id))  ", nativeQuery = true)
    public List<Integer> zoneMaxSumFeedQuantity();

    //funkcja z zapytaniem zwracającym strefy z najmniejszą liczbą zwierząt
    @Query(value = "SELECT zone FROM (SELECT zone, MIN(counter) AS mincounter FROM " +
            "(SELECT zone.id AS zone, COUNT(animal.id) AS counter FROM zone LEFT JOIN animal ON zone.id = animal.zone_id GROUP BY zone.id) GROUP BY zone) " +
            "WHERE mincounter =  ( " +
            "SELECT  MIN(counter) AS mincounter FROM " +
            "           (SELECT zone.id AS zone, COUNT(animal.id) AS counter FROM zone LEFT JOIN animal ON zone.id = animal.zone_id GROUP BY zone.id))", nativeQuery = true)
    List<Integer> getSecondReport();
}
