package cn.boz.lang;

import cn.boz.lang.lexer.BluebozLexer;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class BluebozLexerAdapter extends FlexAdapter {
    public BluebozLexerAdapter() {
        super(new BluebozLexer(null));
    }
}
