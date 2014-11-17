/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg5;

import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Axel
 */
public class CurrencyDialog extends JPanel {
    
    public CurrencyDialog(){
        super();
        add(createCombobox());
    }

    private JComboBox createCombobox() {
        return new JComboBox(new String[] {"EUR","USD","GBP"});
    }
}
