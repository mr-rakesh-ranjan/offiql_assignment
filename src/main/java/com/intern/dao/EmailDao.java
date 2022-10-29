package com.intern.dao;

import com.intern.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailDao extends JpaRepository<Email, Long> {
}
