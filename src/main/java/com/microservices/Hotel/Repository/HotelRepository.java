package com.microservices.Hotel.Repository;

import com.microservices.Hotel.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
