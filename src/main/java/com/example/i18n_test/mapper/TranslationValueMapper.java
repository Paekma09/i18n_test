package com.example.i18n_test.mapper;

import com.example.i18n_test.model.TranslationValue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TranslationValueMapper {
    List<TranslationValue> findByTranslationId(Long translationId);
    void saveTranslationValue(TranslationValue translationValue);
}
