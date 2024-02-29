package com.safety.comptespringproject.repositories;

import com.safety.comptespringproject.entities.BancAcount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancAcountRepo extends JpaRepository<BancAcount,Long> {
}
