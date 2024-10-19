package com.keyin;

import com.keyin.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository<Aircraft> extends JpaRepository<Aircraft, Long> {}
