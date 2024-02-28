/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author syaamil
 */
public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) {
            return false;
        }

        backup();
        String text = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(text);
        return true;
    }

    private String cutString(String text) {
        String start = text.substring(0, editor.textField.getSelectionStart());
        String end = text.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
