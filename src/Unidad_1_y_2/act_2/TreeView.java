package Unidad_1_y_2.act_2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeView {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JTreeTest");
        f.setSize(200, 150);
        f.getContentPane().setLayout(new FlowLayout());
        DefaultMutableTreeNode titulo = new DefaultMutableTreeNode("Programación en Java");
        DefaultMutableTreeNode capitulo = new DefaultMutableTreeNode("AWT");
        titulo.add(capitulo);
        capitulo = new DefaultMutableTreeNode("JFC");
        titulo.add(capitulo);
        JTree tree = new JTree(titulo);
        JScrollPane sp = new JScrollPane(tree);
        f.getContentPane().add(sp);
        f.setVisible(true);
    }
}

