package cn.boz.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class BluebozFile extends PsiFileBase {
    protected BluebozFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BluebozLang.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return BluebozFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Blueboz File";
    }
}
