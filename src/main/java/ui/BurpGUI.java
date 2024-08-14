package ui;

import burp.IBurpExtenderCallbacks;
import burp.IHttpService;
import burp.IMessageEditor;
import burp.IMessageEditorController;

import javax.swing.*;
import java.awt.*;

public class BurpGUI implements IMessageEditorController {
    public JPanel root;
    private IMessageEditor reqMessageEditor;

    private IBurpExtenderCallbacks callbacks;

    public BurpGUI(IBurpExtenderCallbacks cb) {
        callbacks = cb;
        createUIComponents();//这一行一定要加，不然会报空指针错误
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
        root = new JPanel();
        reqMessageEditor = this.callbacks.createMessageEditor(BurpGUI.this,false);

        if (reqMessageEditor != null) {
            root.add(reqMessageEditor.getComponent());
        } else {
            callbacks.printOutput("reqMessageEditor is null!");
        }

    }

    @Override
    public IHttpService getHttpService() {
        return null;
    }

    @Override
    public byte[] getRequest() {
        return new byte[0];
    }

    @Override
    public byte[] getResponse() {
        return new byte[0];
    }


}
