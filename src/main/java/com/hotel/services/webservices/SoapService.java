package com.hotel.performance.soap;
import com.hotel.performance.model.Reservation;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;
@WebService
public interface SoapService {
    @WebMethod
    Reservation createReservation(@WebParam(name = "reservation") Reservation reservation,
                                  @WebParam(name = "clientId") Long clientId,
                                  @WebParam(name = "roomId") Long roomId);
    @WebMethod
    Reservation getReservation(@WebParam(name = "reservationId") Long reservationId);
    @WebMethod
    List<Reservation> getAllReservations();
    @WebMethod
    Reservation updateReservation(@WebParam(name = "reservationId") Long reservationId,
                                  @WebParam(name = "updatedReservation") Reservation updatedReservation);
    @WebMethod
    void deleteReservation(@WebParam(name = "reservationId") Long reservationId);
}