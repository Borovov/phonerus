package com.resin.phonerus.repository;

import com.resin.phonerus.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, UUID> {
}
