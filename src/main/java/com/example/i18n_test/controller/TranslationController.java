package com.example.i18n_test.controller;

import com.example.i18n_test.model.Translation;
import com.example.i18n_test.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/translations")
public class TranslationController {

    @Autowired
    private TranslationService translationService;

    @GetMapping("/{id}")
    public String getTranslation(@PathVariable(required = false) Long id, Model model) {
        Translation translation;
        if (id == null) {
            translation = translationService.createEmptyTranslation();
        } else {
            translation = translationService.getTranslationById(id);
        }
        model.addAttribute("translation", translation);
        return "translationForm";
    }

    @GetMapping
    public String getTranslationForm(Model model) {
        Translation translation = translationService.createEmptyTranslation();
        model.addAttribute("translation", translation);
        return "translationForm";
    }

    @PostMapping
    public String saveTranslation(@ModelAttribute Translation translation) {
        translationService.saveTranslation(translation);
        return "redirect:/translations/";
    }
}
