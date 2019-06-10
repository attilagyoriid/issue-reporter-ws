package com.ericsson.rv.services.issuereporter.issuereporter.repositories;

import com.ericsson.rv.services.issuereporter.issuereporter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
