package com.example.i18n_test.service;

import com.example.i18n_test.model.Translation;

import java.util.List;

public interface TranslationService {
    Translation getTranslationById(Long id);
    void saveTranslation(Translation translation);
    List<Translation> getAllTranslations();
    Translation createEmptyTranslation();
}
