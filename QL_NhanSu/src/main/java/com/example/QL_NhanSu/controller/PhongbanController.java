package com.example.QL_NhanSu.controller;

import com.example.QL_NhanSu.entity.PHONGBAN;
import com.example.QL_NhanSu.service.PhongbanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/phongban")
public class PhongbanController {
    @Autowired
    private PhongbanService phongbanService;

    @GetMapping("/list")
    public String showAllPhongban(Model model) {
        List<PHONGBAN> phongbans = phongbanService.getAllPhongban();
        model.addAttribute("phongbans", phongbans);
        return "phongban/list";
    }
}
