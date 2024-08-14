package burp;

import ui.BurpGUI;

import javax.swing.*;
import java.awt.*;

public class BurpExtender implements IBurpExtender,ITab {

    private JPanel jPanelMain;
    private IBurpExtenderCallbacks callbacks;

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {

        this.callbacks = callbacks;

        callbacks.setExtensionName("First GUI plug tool");
        callbacks.printOutput("this is first gui plug tool");

        BurpGUI UI = new BurpGUI(callbacks);
        jPanelMain = UI.root;
        callbacks.customizeUiComponent(jPanelMain);

        callbacks.addSuiteTab(this);

    }

    @Override
    public String getTabCaption() {
        return "First GUI";
    }

    @Override
    public Component getUiComponent() {
        return jPanelMain;
    }
}
