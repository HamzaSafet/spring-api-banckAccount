package com.safety.comptespringproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BancAcount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;
    private String numeroCompte;
    private double balance;
    private String currency;
    private String status;
}
