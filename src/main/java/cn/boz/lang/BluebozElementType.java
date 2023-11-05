package cn.boz.lang;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * 元素类型
 */
public class BluebozElementType extends IElementType {

  public BluebozElementType(@NotNull @NonNls String debugName) {
    super(debugName, BluebozLang.INSTANCE);
  }

}