package com.luoboduner.weredis.desktop.ui;

import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author rememberber(https://github.com/rememberber)
 */
public class MainWindow {
    public static MainWindow mainWindow;
    private static Log logger = LogFactory.get();
    public static JFrame frame;
    private JPanel mainPanel;
    private JSplitPane splitPane;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JButton button1;
    private JButton button2;
    private JTree tree1;

    public MainWindow() {

    }

    public static void main(String[] args) {
        logger.info("main start");

        Init.initTheme();
        Init.initGlobalFont();  //统一设置字体

        frame = new JFrame(ConstantsUI.APP_NAME);
        frame.setIconImage(ConstantsUI.IMAGE_ICON);

        //得到屏幕的尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((int) (screenSize.width * 0.1), (int) (screenSize.height * 0.08), (int) (screenSize.width * 0.8),
                (int) (screenSize.height * 0.8));

        Dimension preferSize = new Dimension((int) (screenSize.width * 0.8),
                (int) (screenSize.height * 0.8));
        frame.setPreferredSize(preferSize);

        mainWindow = new MainWindow();

        frame.setContentPane(mainWindow.mainPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // 添加事件监听
    }
}
