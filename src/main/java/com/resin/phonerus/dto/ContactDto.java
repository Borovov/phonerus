package com.resin.phonerus.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ContactDto {

    private UUID id;

    private String firstName;

    private String lastName;

    private String patronymic;

    private String jobPost;

    private String department;

    private String struct;

    private String audience;

    private String internalNumber;

    private String landlineNumber;
}
