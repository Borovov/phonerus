package com.resin.phonerus.controller;

import com.resin.phonerus.dto.ContactDto;
import com.resin.phonerus.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping(path = "/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/ids")
    Collection<ContactDto> getContactsByIds(@RequestBody Collection<UUID> ids) {
        return contactService.findContacts(ids);
    }
}
