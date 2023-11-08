// This is a generated file. Not intended for manual editing.
package cn.boz.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.boz.lang.psi.BluebozTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cn.boz.lang.psi.*;
import cn.boz.lang.BluebozPsiImplUtil;

public class BluebozPropertyImpl extends ASTWrapperPsiElement implements BluebozProperty {

  public BluebozPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BluebozVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BluebozVisitor) accept((BluebozVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return BluebozPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return BluebozPsiImplUtil.getValue(this);
  }

}
