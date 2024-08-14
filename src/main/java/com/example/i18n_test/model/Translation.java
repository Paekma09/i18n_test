package com.example.i18n_test.model;

import java.util.List;

public class Translation {
    private Long id;
    private String key;
    private List<TranslationValue> values;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<TranslationValue> getValues() {
        return values;
    }

    public void setValues(List<TranslationValue> values) {
        this.values = values;
    }
}
