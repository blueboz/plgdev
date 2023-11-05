package cn.boz.lang;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Token 类型
 */
public class BluebozTokenType extends IElementType {

    public BluebozTokenType(@NonNls @NotNull String debugName) {
        super(debugName, BluebozLang.INSTANCE);
    }

}
