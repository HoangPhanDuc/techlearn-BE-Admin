package com.techzen.techlearn.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tbl_points")
public class PointEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Integer points;
    BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_currency", referencedColumnName = "id")
    CurrencyEntity currency;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    UserEntity user;
}