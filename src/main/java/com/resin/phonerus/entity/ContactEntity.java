package com.resin.phonerus.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contact", schema = "public")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    /**
     * Имя
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * Фамилия
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * Отчество
     */
    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    /**
     * Должность
     */
    @Column(name = "job_post")
    private String jobPost;

    /**
     * Отдел
     */
    @Column(name = "department")
    private String department;

    /**
     * Корпус
     */
    @Column(name = "struct")
    private String struct;

    /**
     * Аудитория
     */
    @Column(name = "audience")
    private String audience;

    /**
     * Внутрений номер
     */
    @Column(name = "internal_number")
    private String internalNumber;

    /**
     * Городской номер
     */
    @Column(name = "landline_number")
    private String landlineNumber;
}
