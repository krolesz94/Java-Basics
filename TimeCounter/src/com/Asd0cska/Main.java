package com.Asd0cska;

import javax.swing.*;

public class Main {

    JFrame frame = new JFrame("Counter");
    JList<Values> listMinutes = new JList<Values>();
    DefaultListModel<Values> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();

    public Main() {

        listMinutes.setModel(model);

//        model.addElement(new Values());

        splitPane.setLeftComponent(new JScrollPane(listMinutes));
        panel.add(label);
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public class Values {
        int[] value;

        public Values(int[] value){
            this.value = value;

            for (int i = 0; i <= value.length; i++){
                value[i] += 1;
            }
        }
    }
}
