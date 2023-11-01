package com.microservices.Hotel.Service;

import com.microservices.Hotel.Entity.Hotel;
import com.microservices.Hotel.Repository.HotelRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(Hotel hotel) {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> getHotel(long id) {
        return hotelRepository.findById(id);
    }

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public Hotel updateHotel(long id, Hotel updatedHotel) {
        Optional<Hotel> existingHotel = hotelRepository.findById(id);
        if (existingHotel.isPresent()) {
            Hotel hotel = existingHotel.get();
            hotel.setName(updatedHotel.getName());
            hotel.setLocation(updatedHotel.getLocation());
            hotel.setAbout(updatedHotel.getAbout());
            return hotelRepository.save(hotel);
        } else {
            throw new EntityNotFoundException("Hotel with ID " + id + " not found");
        }
    }

    public void deleteHotel(long id) {
        hotelRepository.deleteById(id);
    }

}
