package com.example.i18n_test.controller;

import com.example.i18n_test.model.Translation;
import com.example.i18n_test.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TranslationFormController {
    @Autowired
    private TranslationService translationService;

    @GetMapping("/translations")
    public String showForm(Model model) {
        model.addAttribute("translation", new Translation());
        return "translationForm";
    }

    @PostMapping("/translations")
    public String submitForm(Translation translation) {
        translationService.saveTranslation(translation);
        return "redirect:/translations";
    }
}
