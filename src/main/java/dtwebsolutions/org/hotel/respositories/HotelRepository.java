package dtwebsolutions.org.hotel.respositories;

import dtwebsolutions.org.hotel.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
