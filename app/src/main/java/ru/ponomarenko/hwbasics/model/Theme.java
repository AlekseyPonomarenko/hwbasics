package ru.ponomarenko.hwbasics.model;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import ru.ponomarenko.hwbasics.R;

public enum Theme {

    ONE(R.style.Theme_Hwbasics, R.string.theme_1, "themeone"),
    TWO(R.style.Theme_Hwbasics_V2, R.string.theme_2, "themetwo"),
    THREE(R.style.Theme_Hwbasics_V3, R.string.theme_3, "themethree");



    @StyleRes
    private final int themeRes;

    @StringRes
    private final int title;

    private final String key;

    Theme(int themeRes, int title, String key) {
        this.themeRes = themeRes;
        this.title = title;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public int getTitle() {
        return title;
    }

    public int getThemeRes() {
        return themeRes;
    }
}
