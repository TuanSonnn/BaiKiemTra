package com.example.QL_NhanSu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "PHONGBAN")
public class PHONGBAN {
    @Id
    @Column(name = "Ma_Phong")
    private String Ma_Phong;

    @Column(name = "Ten_Phong")
    @NotNull
    @Size(max = 30, min = 1)
    private String Ten_Phong;
}
