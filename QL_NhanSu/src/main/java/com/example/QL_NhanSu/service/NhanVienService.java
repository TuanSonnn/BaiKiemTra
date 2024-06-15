package com.example.QL_NhanSu.service;

import com.example.QL_NhanSu.entity.NHANVIEN;
import com.example.QL_NhanSu.repository.NhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NhanVienService {

    @Autowired
    private NhanvienRepository nhanvienRepository;

    public List<NHANVIEN> getAllNV() {
        return nhanvienRepository.findAll();
    }

    public NHANVIEN getNVbyID(String id) {
        return nhanvienRepository.findById(id).orElse(null);
    }
    @Transactional
    public void addNV(NHANVIEN nhanvien) {
        nhanvienRepository.save(nhanvien);
    }

    public void deleteNV(String id) {
        nhanvienRepository.deleteById(id);
    }

    public void updateNV(NHANVIEN nhanvien) {
        nhanvienRepository.save(nhanvien);
    }
}
