package com.example.i18n_test.controller;

import com.example.i18n_test.model.Translation;
import com.example.i18n_test.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/translations")
public class TranslationApiController {
    @Autowired
    private TranslationService translationService;

    @GetMapping
    public List<Translation> getAllTranslations() {
        return translationService.getAllTranslations();
    }
}
