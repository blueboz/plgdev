package cn.boz.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BluebozFileType extends LanguageFileType {

    public static final BluebozFileType INSTANCE=new BluebozFileType();

    private BluebozFileType(){
        super(BluebozLang.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "blueboz File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "blueboz language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "blueboz";
    }

    @Override
    public Icon getIcon() {
        return BluebozIcons.FILE;
    }
}
