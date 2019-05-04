package org.ashina.mycontact.controller;

import org.ashina.mycontact.service.ContactService;
import org.ashina.mycontact.service.sinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private sinhVienService sinhvienService;

    @GetMapping("/contact")
    public String list(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "list";
    }
    @GetMapping("/contact/{id}/list")
    public String edit(@PathVariable("id") Long id, Model model) {
        System.out.println(id);
        model.addAttribute("sinhviens", sinhvienService.findByIdlop(id));
        return "listsv";
    }


}
