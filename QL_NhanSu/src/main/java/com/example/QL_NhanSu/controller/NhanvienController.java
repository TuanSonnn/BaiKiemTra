package com.example.QL_NhanSu.controller;

import com.example.QL_NhanSu.entity.NHANVIEN;
import com.example.QL_NhanSu.entity.PHONGBAN;
import com.example.QL_NhanSu.service.NhanVienService;
import com.example.QL_NhanSu.service.PhongbanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanvienController {

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongbanService phongbanService;

    // Mapping to show all employees
    @GetMapping("/list")
    public String showAllNV(Model model) {
        List<NHANVIEN> nhanviens = nhanVienService.getAllNV();
        model.addAttribute("nhanviens", nhanviens);
        return "nhanvien/list";
    }


    // Mapping to show add new employee form
    @GetMapping("/add")
    public String showAddNVForm(Model model) {
        NHANVIEN nhanvien = new NHANVIEN();
        model.addAttribute("nhanvien", nhanvien);
        List<PHONGBAN> phongbans = phongbanService.getAllPhongban();
        model.addAttribute("phongbans", phongbans);

        return "nhanvien/add";
    }

    // Mapping to process add new employee
    @PostMapping("/add")
    public String addNV(@ModelAttribute("nhanvien") NHANVIEN nhanvien) {
        nhanVienService.addNV(nhanvien);
        return "redirect:/nhanvien/list";
    }

    // Mapping to show edit employee form
    @GetMapping("/edit/{id}")
    public String showEditNVForm(@PathVariable("id") String id, Model model) {
        NHANVIEN nhanvien = nhanVienService.getNVbyID(id);
        model.addAttribute("nhanvien", nhanvien);
        model.addAttribute("phongbans", phongbanService.getAllPhongban());
        return "nhanvien/edit";
    }

    // Mapping to process edit employee
    @PostMapping("/edit/{id}")
    public String updateNV(@PathVariable("id") String id, @ModelAttribute NHANVIEN nhanvien) {
        nhanVienService.updateNV(nhanvien);
        return "redirect:/nhanvien/list";
    }

    // Mapping to delete employee
    @GetMapping("/delete/{id}")
    public String deleteNV(@PathVariable("id") String id) {
        nhanVienService.deleteNV(id);
        return "redirect:/nhanvien/list";
    }
}


