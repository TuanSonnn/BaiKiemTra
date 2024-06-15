package com.example.QL_NhanSu.repository;

import com.example.QL_NhanSu.entity.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanvienRepository extends JpaRepository<NHANVIEN, String> {
}
