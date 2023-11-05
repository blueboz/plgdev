package cn.boz.lang;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * 自定义我的语言
 */
public class BluebozLang extends Language {

    public static final BluebozLang INSTANCE = new BluebozLang();

    protected BluebozLang() {
        super("Blueboz");
    }
}
