package cn.boz.lang;

import cn.boz.lang.psi.BluebozProperty;
import cn.boz.lang.psi.BluebozTypes;
import com.intellij.lang.ASTNode;

public class BluebozPsiImplUtil {

  public static String getKey(BluebozProperty element) {
    ASTNode keyNode = element.getNode().findChildByType(BluebozTypes.KEY);
    if (keyNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to simple spaces
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
    }
  }

  public static String getValue(BluebozProperty element) {
    ASTNode valueNode = element.getNode().findChildByType(BluebozTypes.VALUE);
    if (valueNode != null) {
      return valueNode.getText();
    } else {
      return null;
    }
  }

}