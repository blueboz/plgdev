// This is a generated file. Not intended for manual editing.
package cn.boz.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cn.boz.lang.psi.impl.*;

public interface BluebozTypes {

  IElementType ITEM_ = new BluebozElementType("ITEM_");
  IElementType PROPERTY = new BluebozElementType("PROPERTY");

  IElementType COMMENT = new BluebozTokenType("COMMENT");
  IElementType CRLF = new BluebozTokenType("CRLF");
  IElementType KEY = new BluebozTokenType("KEY");
  IElementType SEPARATOR = new BluebozTokenType("SEPARATOR");
  IElementType VALUE = new BluebozTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ITEM_) {
        return new BluebozItem_Impl(node);
      }
      else if (type == PROPERTY) {
        return new BluebozPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
