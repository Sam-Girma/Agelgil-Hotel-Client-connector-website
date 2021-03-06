package com.agelgil.agelgil.admin.controllers.dashboard.forms;

import javax.persistence.Transient;

import com.agelgil.agelgil.hotel.data.models.Hotel;
import com.agelgil.agelgil.hotel.data.repositories.HotelRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class VertifyHotelForm {
	

	private Hotel hotel;

	public void verifyHotel(HotelRepository hotelRepository){
		hotel.setVerified(true);
		hotelRepository.save(hotel);
	}

}
