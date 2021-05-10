package one.digitalinnovation.citiesdistances.api.repository;

import one.digitalinnovation.citiesdistances.api.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "select earth_distance\n" +
            "   (ll_to_earth(?1,?2), ll_to_earth(?3,?4))\n" +
            "   as distance;", nativeQuery = true)
    Double distanceByCube(final double lat1, final double lon1, final double lat2, final double lon2);

    @Query(value = "select ((select lat_lon from cidade where id = ?1)\n" +
            "   <@> (select lat_lon from cidade where id=?2))\n" +
            "   as distance", nativeQuery = true)
    Double distanceByPoints(final Long city1, final Long city2);
}
