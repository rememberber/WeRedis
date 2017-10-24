import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

import javax.swing.*;

public class HelloWorldWindow implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

        JComponent parent = toolWindow.getComponent();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello World!!");
        panel.add(label);
        parent.add(panel);
    }
}
