package com.intern.dao;

import com.intern.entity.Email;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface EmailDao extends JpaRepository<Email, Long> {
//
//    @Query("select  count(*) from Email x where x.emailFrom = :e")
//    public long getDistinctByEmailFrom(@Param(e) long userId);

//    @Query("select count(q) from Email q where q.emailFrom = (select r.emailAddress from User r where r.userId = :e)")
    @Query(nativeQuery = true)
    public long getEmailFrom(long userId);
}
