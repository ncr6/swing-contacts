package entidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deerfox@debian
 */

public class ControlTabla {

    private DefaultTableModel modelo;

    public ControlTabla(ListaContactos l) {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        updateModelo(l);
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public void updateModelo(ListaContactos l) {
        modelo.setRowCount(0);
        l.getLista().forEach((c) -> modelo.addRow(new Object[]{
            c.getApellido(), c.getNombre(), c.getFijo(), c.getCelular(), c.getCorreo()
        }));
    }
}
