package com.luoboduner.weredis.desktop.ui;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * UI相关的常量
 *
 * @author rememberber(https://github.com/rememberber)
 */
public class ConstantsUI {

    /**
     * 软件名称,版本
     */
    public final static String APP_NAME = "WeRedis";
    public final static String APP_VERSION = "v_1.2.0_170831";

    /**
     * 主窗口图标
     */
    public final static Image IMAGE_ICON = Toolkit.getDefaultToolkit()
            .getImage(MainWindow.class.getResource("/icon/logo-md.png"));

}
