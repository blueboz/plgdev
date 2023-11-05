package cn.boz.test;

import cn.boz.gen.ExprBaseListener;
import cn.boz.gen.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;

public class CalculatorListener extends ExprBaseListener {
    private JTextArea inputArea;
    private JTextArea outputArea;

    public CalculatorListener(JTextArea inputArea, JTextArea outputArea) {
        this.inputArea = inputArea;
        this.outputArea = outputArea;
    }

    @Override
    public void exitExpr(ExprParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            // 处理整数
            int result = Integer.parseInt(ctx.INT().getText());
            outputArea.setText(Integer.toString(result));
        } else if (ctx.getChildCount() == 3) {
            // 处理二元操作符表达式
            int leftOperand = Integer.parseInt(ctx.expr(0).getText());
            int rightOperand = Integer.parseInt(ctx.expr(1).getText());
            String operator = ctx.getChild(1).getText();

            int result;
            switch (operator) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    result = leftOperand / rightOperand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            outputArea.setText(Integer.toString(result));
        }
    }
}
