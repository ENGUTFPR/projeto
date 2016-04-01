/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;

/**
 *
 * @author Wagner Chaves
 */
public class ComboBox {

    public void loadDayOfMonth(JComboBox dayCB, int month, int year) {
        dayCB.removeAllItems();
        Calendar cal = new GregorianCalendar(year, month, 1);
        while (month == cal.get(Calendar.MONTH)) {
            dayCB.addItem(makeObjToItemList("" + cal.get(Calendar.DAY_OF_MONTH)));
            cal.add(Calendar.DATE, 1);
        }
    }

    public void loadYears(JComboBox yearCB, int currentYear) {
        int i;
        yearCB.removeAllItems();
        for (i = currentYear; i >= (currentYear - 200); i--) {
            yearCB.addItem(makeObjToItemList("" + i));
        }
    }

    public void loadMonths(JComboBox monthCB) {
        monthCB.removeAllItems();
        monthCB.addItem(makeObjToItemList("Janeiro"));
        monthCB.addItem(makeObjToItemList("Fevereiro"));
        monthCB.addItem(makeObjToItemList("Março"));
        monthCB.addItem(makeObjToItemList("Abril"));
        monthCB.addItem(makeObjToItemList("Maio"));
        monthCB.addItem(makeObjToItemList("Junho"));
        monthCB.addItem(makeObjToItemList("Julho"));
        monthCB.addItem(makeObjToItemList("Agosto"));
        monthCB.addItem(makeObjToItemList("Setembro"));
        monthCB.addItem(makeObjToItemList("Outubro"));
        monthCB.addItem(makeObjToItemList("Novembro"));
        monthCB.addItem(makeObjToItemList("Dezembro"));
    }

    private Object makeObjToItemList(String string) {
        Object obj = string;
        return obj;
    }

}
