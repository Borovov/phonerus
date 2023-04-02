package com.resin.phonerus.service;

import com.resin.phonerus.dto.ContactDto;

import java.util.Collection;
import java.util.UUID;

public interface ContactService {

    Collection<ContactDto> findContacts(Collection<UUID> ids);

    //TODO remove on production
    Collection<ContactDto> findAllContacts();

    Collection<ContactDto> saveContacts(Collection<ContactDto> dtos);

    Collection<ContactDto> updateContacts(Collection<ContactDto> dtos);

    void deleteContacts(Collection<UUID> ids);

}
