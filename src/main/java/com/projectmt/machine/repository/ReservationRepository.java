package com.projectmt.machine.repository;

import com.projectmt.machine.entity.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Jeferson
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
   
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    public List<Reservation> findAllByStartDateBetween(Date dateOne, Date dateTwo);
    public List<Reservation> findAllByStatus(String status);
    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();
}
