package com.example.QL_NhanSu.service;

import com.example.QL_NhanSu.entity.PHONGBAN;
import com.example.QL_NhanSu.repository.PhongbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongbanService {

    @Autowired
    private PhongbanRepository phongbanRepository;

    public List<PHONGBAN> getAllPhongban() {
        return phongbanRepository.findAll();
    }

    public PHONGBAN getPhongbanById(String id) {
        return phongbanRepository.findById(id).orElse(null);
    }

    public PHONGBAN savePhongban(PHONGBAN phongban) {
        return phongbanRepository.save(phongban);
    }

    public void deletePhongban(String id) {
        phongbanRepository.deleteById(id);
    }
}
