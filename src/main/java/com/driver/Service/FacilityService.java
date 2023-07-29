package com.driver.Service;

import com.driver.Repository.HotelRepository;

public class FacilityService {
    private final HotelRepository hotelRepository = new HotelRepository();

    public String getMaxnoOfFacilities(){
        return hotelRepository.hotelWithMAxFacilities();
    }
}
