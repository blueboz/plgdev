package cn.boz.swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SyntaxHighlightDemo extends JFrame {
    private JTextArea textArea;

    public SyntaxHighlightDemo() {
        setTitle("Syntax Highlight Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textArea = new JTextArea();
        // 设置文本区域的其他属性，如字体、大小等
        
        add(textArea);
        pack();
    }

    public static void main(String[] args) {
        SyntaxHighlightDemo demo = new SyntaxHighlightDemo();
        demo.setVisible(true);
    }
}
