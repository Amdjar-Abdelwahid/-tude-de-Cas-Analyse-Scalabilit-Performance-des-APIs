package com.hotel.performance.soap;
import com.hotel.performance.model.Reservation;
import com.hotel.performance.service.HotelService;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@WebService(endpointInterface = "com.hotel.performance.soap.SoapService")
public class SoapServiceImpl implements SoapService {
    @Autowired
    private HotelService hotelService;
    @Override
    public Reservation createReservation(Reservation reservation, Long clientId, Long roomId) {
        return hotelService.createReservation(reservation, clientId, roomId);
    }
    @Override
    public Reservation getReservation(Long reservationId) {
        return hotelService.getReservation(reservationId);
    }
    @Override
    public List<Reservation> getAllReservations() {
        return hotelService.getAllReservations();
    }
    @Override
    public Reservation updateReservation(Long reservationId, Reservation updatedReservation) {
        return hotelService.updateReservation(reservationId, updatedReservation);
    }
    @Override
    public void deleteReservation(Long reservationId) {
        hotelService.deleteReservation(reservationId);
    }
}