package br.ifsp.edu.agenda;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class ListaContatosModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	public static final int NAME_INDEX = 0;
    public static final int TEL1_INDEX = 1;
    public static final int TEL2_INDEX = 2;
    public static final int EMAIL_INDEX = 3;
    public static final int ADDR_INDEX = 4;
	
	protected Vector<Contato> dataVector;
	protected String[] columnNames;
	
	public ListaContatosModel(String[] columnNames) {
        this.columnNames = columnNames;
        dataVector = new Vector<Contato>();
    }
	
	public String getColumnName(int column) {
        return columnNames[column];
    }
	
	public boolean isCellEditable(int row, int column) {
        return false;
    }
	
	public Class<?> getColumnClass(int column) {
        switch (column) {
        	case NAME_INDEX:
        	case TEL1_INDEX:
        	case TEL2_INDEX:
        	case EMAIL_INDEX:
        	case ADDR_INDEX:
        		return String.class;
            default:
            	return Object.class;
        }
    }
	
	public Object getValueAt(int row, int column) {
        Contato record = (Contato)dataVector.get(row);
        switch (column) {
        	case NAME_INDEX:
        		return record.getNome();
        	case TEL1_INDEX:
        		return record.getTelefone1();
        	case TEL2_INDEX:
        		return record.getTelefone2();
        	case EMAIL_INDEX:
        		return record.getEmail();
    		case ADDR_INDEX:
    			return record.getEndereco();
            default:
            	return new Object();
        }
    }

    public void setValueAt(Object value, int row, int column) {
        Contato record = (Contato)dataVector.get(row);
        switch (column) {
        	case NAME_INDEX:
        		record.setNome((String)value);
        	case TEL1_INDEX:
        		record.setNome((String)value);
        	case TEL2_INDEX:
        		record.setNome((String)value);
        	case EMAIL_INDEX:
        		record.setNome((String)value);
        	case ADDR_INDEX:
        		record.setNome((String)value);
        	default:
        		System.out.println("[ERROR] Invalid index.");
        }
        fireTableCellUpdated(row, column);
    }
    
    public boolean hasEmptyRow() {
        if (dataVector.size() == 0) return false;
        Contato contato = (Contato)dataVector.get(dataVector.size() - 1);
        if (contato.getNome().trim().equals("") &&
        	contato.getTelefone1().trim().equals("") &&
        	contato.getTelefone2().trim().equals("") &&
        	contato.getEmail().trim().equals("") &&
        	contato.getEndereco().trim().equals(""))
        {
        	return true;
        }
        else return false;
    }

	public int getRowCount() {
        return dataVector.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }
	
	public void addEmptyRow() {
        dataVector.add(new Contato());
        fireTableRowsInserted(
           dataVector.size() - 1,
           dataVector.size() - 1);
    }

}
