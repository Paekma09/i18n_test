package com.example.i18n_test.mapper;

import com.example.i18n_test.model.Translation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TranslationMapper {
    List<Translation> findByLanguage(@Param("language") String language);
    void saveTranslation(Translation translation);
}
