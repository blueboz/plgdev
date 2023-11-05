package cn.boz.lang;

import cn.boz.lang.psi.BluebozTypes;
import com.intellij.psi.tree.TokenSet;

public interface BluebozTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(BluebozTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(BluebozTypes.COMMENT);

    TokenSet CRLF = TokenSet.create(BluebozTypes.CRLF);
    TokenSet PROPERTY = TokenSet.create(BluebozTypes.PROPERTY);
    TokenSet SEPARATOR = TokenSet.create(BluebozTypes.SEPARATOR);
    TokenSet VALUE = TokenSet.create(BluebozTypes.VALUE);


}