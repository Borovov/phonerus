package com.resin.phonerus.service.impl;

import com.resin.phonerus.dto.ContactDto;
import com.resin.phonerus.entity.ContactEntity;
import com.resin.phonerus.mapper.ContactMapper;
import com.resin.phonerus.repository.ContactRepository;
import com.resin.phonerus.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    private final ContactMapper mapper;

    @Override
    public Collection<ContactDto> findContacts(Collection<UUID> ids) {
        return ids.stream().map(this::findContactById).toList();
    }

    public ContactDto findContactById(UUID id) {
        return mapper.entityToDto(repository.findById(id).get());
    }

    @Override
    public Collection<ContactDto> findAllContacts() {
        return repository.findAll().stream().map(mapper::entityToDto).toList();
    }

    @Override
    public Collection<ContactDto> saveContacts(Collection<ContactDto> dtos) {
        var entities = dtos.stream().map(mapper::dtoToEntity).toList();
        return repository.saveAll(entities).stream().map(mapper::entityToDto).toList();
    }

    @Override
    public Collection<ContactDto> updateContacts(Collection<ContactDto> dtos) {
        return null;
    }

    @Override
    public void deleteContacts(Collection<UUID> ids) {
        repository.deleteAllById(ids);
    }
}
