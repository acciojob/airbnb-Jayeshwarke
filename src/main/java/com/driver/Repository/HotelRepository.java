package com.driver.Repository;

import com.driver.model.Hotel;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HotelRepository {
    // here hotel database hotelname is primary key and corresponding to that we can store hotel instance
    private final HashMap<String, Hotel> hotelDB = new LinkedHashMap<>();





    public void addHotel(Hotel hotel){
        hotelDB.put(hotel.getHotelName(),hotel);
    }

    public Hotel getHotelbyname(String name){
       return hotelDB.get(name);

    }

    public String hotelWithMAxFacilities(){
        String max = "";
        int maxFacilities = Integer.MIN_VALUE;

        for(Hotel hotel:hotelDB.values()){
            if(hotel.getFacilities().size()>maxFacilities){
                maxFacilities=hotel.getFacilities().size();
                max =hotel.getHotelName();

            }else if(hotel.getFacilities().size()==maxFacilities){
                int result = hotel.getHotelName().compareTo(max);
                    if(result<0){
                        max = hotel.getHotelName();
                    }
            }
        }
        return  max;
    }


}
