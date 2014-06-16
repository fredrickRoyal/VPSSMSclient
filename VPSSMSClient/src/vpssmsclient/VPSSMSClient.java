/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vpssmsclient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Royal
 */
public class VPSSMSClient {

    public static JFrame mainWindow;
    public static JMenuBar menuBar;
    private static JMenu fileMenu;
    private static JMenu settingsMenu;
    public static JMenuItem serverSetting;
    static String title = "VPS School Management System [Version 1.0]";
    public static int uniformWidth;
    public static int uniformHeight;
    public static int width;
    public static int height;

    private static class MenuBarActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ev) {
            /* Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dim = toolkit.getScreenSize();
            int width = dim.width;
            int height = dim.height;
            String command = ev.getActionCommand();
            if (command.equalsIgnoreCase("Server Settings")) {
            ServerSettingDialog serverSettingDialog = new ServerSettingDialog(Welcome.mainWindow, true);
            serverSettingDialog.setTitle("Server Settings");
            serverSettingDialog.setLocation(width / 4, height / 5);
            serverSettingDialog.setVisible(true);
            } */
        }
    }

    public VPSSMSClient() {
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");


            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        settingsMenu = new JMenu("Settings");
        serverSetting = new JMenuItem("Server Settings");
        settingsMenu.add(serverSetting);
        menuBar.add(fileMenu);
        menuBar.add(settingsMenu);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        width = dim.width;
        height = dim.height;
        mainWindow = new JFrame(title);

        //mainWindow.setIconImage(getResourceImage("logo.png"));
        mainWindow.setJMenuBar(menuBar);
        mainWindow.setBackground(new Color(212, 201, 201));
        mainWindow.setContentPane(new TaskSelectionMenu());

        int variation = (int) (0.05 * height);
        uniformWidth = ((int) ((96.40625 / 100) * width));
        uniformHeight = height - variation;
        //height - variation
        mainWindow.setSize(width, uniformHeight);
        //mainWindow.setLocation(((int)((1.5625/100)*width)), 0);
        mainWindow.setLocation(0, 0);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(true);


    }

    public static void main(String[] args) {
        new VPSSMSClient();


    }
    /* public  Image getResourceImage(String fileName) {
    String imageDirectory = "images/";
    URL imgURL = getClass().getResource(imageDirectory + fileName);
    //JOptionPane.showMessageDialog(null, imgURL);
    Image image = null;
    try {
    image = ImageIO.read(imgURL);
    } catch (IOException e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return image;
    }*/
}
