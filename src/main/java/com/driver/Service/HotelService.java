package com.driver.Service;

import com.driver.Repository.HotelRepository;
import com.driver.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
  private  final HotelRepository hotelRepository;

  public HotelService(){
      this.hotelRepository = new HotelRepository();
  }

    public void addHotel(Hotel hotel) {
        hotelRepository.addHotel(hotel);
    }

    public Hotel getHotelName(String name){
      return hotelRepository.getHotelbyname(name);

    }




}
