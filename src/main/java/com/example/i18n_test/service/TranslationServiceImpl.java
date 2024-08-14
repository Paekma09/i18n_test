package com.example.i18n_test.service;

import com.example.i18n_test.mapper.TranslationMapper;
import com.example.i18n_test.mapper.TranslationValueMapper;
import com.example.i18n_test.model.Translation;
import com.example.i18n_test.model.TranslationValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TranslationServiceImpl implements TranslationService {

    @Autowired
    private TranslationMapper translationMapper;

    @Autowired
    private TranslationValueMapper translationValueMapper;

    @Override
    public Translation getTranslationById(Long id) {
        Translation translation = translationMapper.findById(id);
        translation.setValues(translationValueMapper.findByTranslationId(id));
        return translation;
    }

    @Override
    public void saveTranslation(Translation translation) {
        translationMapper.saveTranslation(translation);
        for (TranslationValue value : translation.getValues()) {
            value.setTranslationId(translation.getId());
            translationValueMapper.saveTranslationValue(value);
        }
    }

    @Override
    public List<Translation> getAllTranslations() {
        List<Translation> translations = translationMapper.findAll();
        for (Translation translation : translations) {
            translation.setValues(translationValueMapper.findByTranslationId(translation.getId()));
        }
        return translations;
    }

    @Override
    public Translation createEmptyTranslation() {
        Translation translation = new Translation();
        translation.setValues(new ArrayList<>());
        return translation;
    }
}
