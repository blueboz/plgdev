package cn.boz.lang.highlight;

import cn.boz.lang.BluebozIcons;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.ui.dsl.builder.CollapsibleRow;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class BluebozColorSettingsPage implements ColorSettingsPage {

    /**
     * 定义的必须是带有externelName的属性
     */
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", BluebozSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", BluebozSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", BluebozSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", BluebozSyntaxHighlighter.BAD_CHARACTER)
    };


    @Override
    public @Nullable Icon getIcon() {
        return BluebozIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new BluebozSyntaxHighlighter();
    }

    /**
     * 修改字体颜色界面的示例代码
     *
     * @return
     */
    @Override
    public @NonNls @NotNull String getDemoText() {
        return "# You are reading the \".properties\" entry.\n" +
                "! The exclamation mark can also mark text as comments.\n" +
                "website = https://en.wikipedia.org/\n" +
                "language = English\n" +
                "# The backslash below tells the application to continue reading\n" +
                "# the value onto the next line.\n" +
                "message = Welcome to \\\n" +
                "          Wikipedia!\n" +
                "# Add spaces to the key\n" +
                "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                "# Unicode\n" +
                "tab : \\u0009";


    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "Blueboz";
    }
}
