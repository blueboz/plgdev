package cn.boz.test;

import cn.boz.gen.ExprLexer;
import cn.boz.gen.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextArea inputArea;
    private JTextArea outputArea;
    private CalculatorListener listener;

    public Calculator() {
        // 创建窗口和文本区域
        inputArea=new JTextArea();
        outputArea=new JTextArea();
        outputArea.setEditable(false);

        setLayout(new FlowLayout());
//        contentPane.setLayout(new VerticalLayout());
        add(inputArea, BorderLayout.NORTH);
        add(outputArea, BorderLayout.CENTER);
        pack();

        listener = new CalculatorListener(inputArea, outputArea);

        // 添加内容更改监听器以实现语法解析逻辑
        inputArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                parseExpression();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                parseExpression();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // 这个方法在纯文本文档中不会触发
            }
        });
    }

    private void parseExpression() {
        String expression = inputArea.getText();

        // 创建词法分析器和语法分析器
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(expression));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        // 获取语法规则树
        ExprParser.ProgContext tree = parser.prog();

        // 使用监听器遍历语法规则树
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    // 主方法
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Calculator calculator = new Calculator();
            calculator.setVisible(true);

        });
    }
}
