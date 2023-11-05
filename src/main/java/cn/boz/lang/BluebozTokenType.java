package cn.boz.lang;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BluebozTokenType extends IElementType {

    public BluebozTokenType(@NonNls @NotNull String debugName, @Nullable Language language) {
        super(debugName, language);
    }

    protected BluebozTokenType(@NonNls @NotNull String debugName, @Nullable Language language, boolean register) {
        super(debugName, language, register);
    }
}
