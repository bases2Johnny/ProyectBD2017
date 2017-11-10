/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import File.Ejecutar;
import File.File;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.Estrategia;

/**
 *
 * @author jimen
 */
public class RenderButton extends JButton implements TableCellRenderer {

    public RenderButton() {
        //SET BUTTON PROPERTIES
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj,
            boolean selected, boolean focused, int row, int col) {

        //SET PASSED OBJECT AS BUTTON TEXT
        setText((obj == null) ? "" : obj.toString());

        return this;
    }
}
//public class ButtonColumn extends AbstractCellEditor
//        implements TableCellRenderer, TableCellEditor, ActionListener {
//
//    JTable table;
//    JButton renderButton;
//    JButton editButton;
//    String text;
//    private final Estrategia est;
//
//    public ButtonColumn(JTable table, int column, Estrategia est) {
//        super();
//        this.est = est;
//        //System.out.println(est);
//        this.table = table;
//        renderButton = new JButton();
//        editButton = new JButton();
//        editButton.setFocusPainted(false);
//        editButton.addActionListener(this);
//
//        TableColumnModel columnModel = table.getColumnModel();
//        columnModel.getColumn(column).setCellRenderer(this);
//        columnModel.getColumn(column).setCellEditor(this);
////        table.add(this);
//    }
//
//    @Override
//    public Component getTableCellRendererComponent(
//            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        value = "Ejecutar";
//        if (hasFocus) {
//            renderButton.setForeground(table.getForeground());
//            renderButton.setBackground(UIManager.getColor("Button.background"));
//        } else if (isSelected) {
//            renderButton.setForeground(table.getSelectionForeground());
//            renderButton.setBackground(table.getSelectionBackground());
//        } else {
//            renderButton.setForeground(table.getForeground());
//            renderButton.setBackground(UIManager.getColor("Button.background"));
//        }
//        renderButton.setText((value == null) ? "" : value.toString());
////        renderButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent ae) {
////                System.out.println("Correcto papi..");
////                accion();
////            }
////        });
//        return renderButton;
//    }
//
//    @Override
//
//    public Component getTableCellEditorComponent(
//            JTable table, Object value, boolean isSelected, int row, int column) {
//        text = (value == null) ? "" : value.toString();
//        editButton.setText(text);
////        editButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent ae) {
////                System.out.println("Correcto papi..");
////                accion();
////            }
////        });
//        return editButton;
//    }
//
//    private Boolean sePasoLaHora() {
//        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
//        List<String> diasEst = Arrays.asList(est.getDias().split(","));
//        int day = LocalDate.now().getDayOfWeek().getValue();
//        Date fecha = new Date();
//
//        List<String> time = Arrays.asList(est.getHora().split(":"));
//
//        Integer hoursEst = Integer.parseInt(time.get(0));
//        Integer minutesEst = Integer.parseInt(time.get(1));
//
//        Integer hours = fecha.getHours();
//        Integer minutes = fecha.getMinutes();
////        System.out.println("HorasN: " + hours + ":" + minutes);
////        System.out.println("HorasE: " + hoursEst + ":" + minutesEst);
////        System.out.println(est);
//        return ((diasEst.contains(dias[day - 1])) && ((hoursEst < hours))
//                || (diasEst.contains(dias[day - 1])
//                && (hoursEst.equals(hours))
//                && minutes > minutesEst));
//    }
//
//    @Override
//    public Object getCellEditorValue() {
//        return text;
//    }
//
//    private void accion() {
//        File f = new File();
//        System.out.println(this.sePasoLaHora());
//        System.out.println(this.est);
//        if (this.sePasoLaHora()) {
//            f.write(est.getEstrategia(), est.getName() + ".txt", "Backups");
//            String plantilla = "@echo off\n"
//                    + "rman target / @C:\\oraclexe\\app\\oracle\\Backups\\" + est.getName() + ".txt "
//                    + "\n exit";
//            f.write(plantilla, est.getName() + ".bat", "Bats");
//            Ejecutar exe = new Ejecutar();
//            exe.cargarBat(est.getName());
//        }
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println(this.est);
////        File f = new File();
////        System.out.println(this.sePasoLaHora());
////        System.out.println(this.est);
////        if (this.sePasoLaHora()) {
////            f.write(est.getEstrategia(), est.getName() + ".txt", "Backups");
////            String plantilla = "@echo off\n"
////                    + "rman target / @C:\\oraclexe\\app\\oracle\\Backups\\" + est.getName() + ".txt "
////                    + "\n exit";
////            f.write(plantilla, est.getName() + ".bat", "Bats");
////            Ejecutar exe = new Ejecutar();
////            exe.cargarBat(est.getName());
////        }
//    }
//}
