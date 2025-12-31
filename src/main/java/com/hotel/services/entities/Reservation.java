package com.hotel.performance.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client associatedClient;
    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre associatedRoom;
    private String startDate;
    private String endDate;
    private String additionalPreferences;
}