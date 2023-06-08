/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_ThanhLy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableTSThanhLy extends AbstractTableModel{
    
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    private String Name[]={"Mã phiếu TL", "Người đề nghị","Đơn vị", "Tài sản TL", "Nội dung","CB kiểm tra","Ngày gửi", "Trạng thái",};
    private Class classes[]={String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,};
    ArrayList<TSThanhLy> dsTSTL = new ArrayList<>();
    
    public TableTSThanhLy(ArrayList<TSThanhLy> tstl) {
        dsTSTL = tstl;
    }
    
    @Override
    public int getRowCount(){
        return dsTSTL.size();
    }
    
    @Override
    public int getColumnCount(){
        return Name.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return switch (columnIndex) {
            //case 0 -> rowIndex + 1;
            case 0 -> dsTSTL.get(rowIndex).getMaPhieuTL();
            case 1 -> dsTSTL.get(rowIndex).getnDeNghi();
            case 2 -> dsTSTL.get(rowIndex).getDonVi();
            case 3 -> dsTSTL.get(rowIndex).getMaTSTL();
            case 4 -> dsTSTL.get(rowIndex).getNoiDung();
            case 5 -> dsTSTL.get(rowIndex).getCbKT();
            case 6 -> dsTSTL.get(rowIndex).getNgayGui();
            case 7 -> dsTSTL.get(rowIndex).getTrangThai();
            default -> null;
        };
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    
    /**
     *
     * @param column
     * @return
     */
    @Override
    public String getColumnName(int column){
        return Name[column];
    }
}
