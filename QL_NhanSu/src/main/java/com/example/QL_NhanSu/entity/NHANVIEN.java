package com.example.QL_NhanSu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="NHANVIEN")
public class NHANVIEN {
    @Id
    @Column(name = "Ma_NV")
    @Size(max = 3)
    private String Ma_NV;

    @Column(name = "Ten_NV")
    @NotNull
    @Size(max = 100, min = 1)
    private String Ten_NV;

    @Column(name = "Phai")
    @Size(max = 3)
    private String Phai;

    @Column(name = "Noi_Sinh")
    @Size(max = 200, min = 1)
    private String Noi_Sinh;

    @Column(name = "Ma_Phong", insertable = false, updatable = false)
    @Size(max = 2)
    private String Ma_Phong;

    @Column(name = "Luong")
    private Integer Luong;

    @ManyToOne
    @JoinColumn(name = "Ma_Phong", referencedColumnName = "Ma_Phong")
    private PHONGBAN phongban;
}