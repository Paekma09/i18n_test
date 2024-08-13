package com.example.i18n_test.service;

import com.example.i18n_test.mapper.TranslationMapper;
import com.example.i18n_test.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationService {
    @Autowired
    private TranslationMapper mapper;

    public List<Translation> getTranslationsBytLanguage(String language) {
        return mapper.findByLanguage(language);
    }

    public void saveTranslation(Translation translation) {
        mapper.saveTranslation(translation);
    }
}
