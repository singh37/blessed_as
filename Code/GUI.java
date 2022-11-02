package Code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
public class GUI {
    public GUI() throws URISyntaxException {
        final URI uri = new URI("https://github.com/SAMA-UW");

        JFrame frame = new JFrame();
        frame.setTitle("SAMA");
        frame.setSize(600, 600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JButton aboutButton = new JButton("ABOUT");
        aboutButton.setBounds(250, 400, 100, 30);


        aboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(uri);
                    } catch (Exception ex) {
                    }
                } else {
                }
            }
        });
        frame.add(aboutButton);








    }

}

