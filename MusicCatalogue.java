package org.example;

import javax.swing.*;
import java.awt.*;

public class MusicCatalogue {
    JFrame frame;
    JButton B1, B2;
    JTextField artistField, studioField;
    JComboBox<String> categoryBox;
    JCheckBox availableCheck;

    public MusicCatalogue() {
        frame = new JFrame("Music Catalogue");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My Music Catalogue", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel, BorderLayout.NORTH);

        String[] categories = {"Rap", "Reggae", "Ballads"};
        JList<String> list = new JList<>(categories);
        frame.add(new JScrollPane(list), BorderLayout.WEST);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 5, 5));

        formPanel.add(new JLabel("Artist Name:"));
        artistField = new JTextField();
        artistField.setName("artistField");
        formPanel.add(artistField);

        formPanel.add(new JLabel("Recording Studio:"));
        studioField = new JTextField();
        studioField.setName("studioField");
        formPanel.add(studioField);

        formPanel.add(new JLabel("Category:"));
        categoryBox = new JComboBox<>(categories);
        categoryBox.setName("categoryBox");
        formPanel.add(categoryBox);

        formPanel.add(new JLabel("Available:"));
        availableCheck = new JCheckBox();
        availableCheck.setName("availableCheck");
        formPanel.add(availableCheck);

        frame.add(formPanel, BorderLayout.CENTER);

        JPanel panelSouth = new JPanel();
        B1 = new JButton("Submit");
        B1.setName("Submit");
        B2 = new JButton("Exit");

        panelSouth.add(B1);
        panelSouth.add(B2);
        frame.add(panelSouth, BorderLayout.SOUTH);

        B1.addActionListener(e -> {
            String artistName = artistField.getText();
            String studioName = studioField.getText();
            String category = (String) categoryBox.getSelectedItem();
            boolean available = availableCheck.isSelected();

            System.out.println("Artist Name: " + artistName);
            System.out.println("Recording Studio: " + studioName);
            System.out.println("Category: " + category);
            System.out.println("Available: " + available);
        });

        B2.addActionListener(e -> System.exit(0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}