package com.example.multiplethemes;

import android.content.Context;

abstract class ThemeManager {

    public static void set(Context context, String activeTheme) {
        int themeResourceID = R.style.IslamicTheme;
        if (activeTheme.equals("GeneralTheme")) {
            themeResourceID = R.style.GeneralTheme;
        }
        context.setTheme(themeResourceID);
    }
}
