package com.example.i18n_test.controller;

import com.example.i18n_test.model.Translation;
import com.example.i18n_test.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/translations")
public class TranslationController {
    @Autowired
    private TranslationService service;

    @GetMapping("/{language}")
    public List<Translation> getTranslations(@PathVariable String language) {
        return service.getTranslationsBytLanguage(language);
    }

    @PostMapping
    public void saveTranslation(@RequestBody Translation translation) {
        service.saveTranslation(translation);
    }
}
