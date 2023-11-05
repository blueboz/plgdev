// This is a generated file. Not intended for manual editing.
package cn.boz.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.boz.lang.psi.BluebozTypes.*;
import cn.boz.lang.psi.ASTWrapperPsiElement;
import cn.boz.lang.psi.*;

public class BluebozItem_Impl extends ASTWrapperPsiElement implements BluebozItem_ {

  public BluebozItem_Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BluebozVisitor visitor) {
    visitor.visitItem_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BluebozVisitor) accept((BluebozVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BluebozProperty getProperty() {
    return findChildByClass(BluebozProperty.class);
  }

}
