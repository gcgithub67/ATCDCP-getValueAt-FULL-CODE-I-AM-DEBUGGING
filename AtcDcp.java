
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcdcp;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import static java.lang.Boolean.FALSE;
import java.util.ArrayList;

import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;


    /**
     * @param args the command line arguments
     */
    public class AtcDcp extends JPanel {
        
    public static JTable table;
    public static JPanel panel;
    public static JFrame frame;
   
    Object aVal =(Object)Boolean.FALSE;
    Object aVal2 =(Object)Boolean.TRUE;
    
    //VECTOR OF VECTORS
    Object [][]array2;
        Vector<Vector<?>> vlist2 =  new Vector<Vector<?>>();
        Vector tempVector1 = new Vector();
        Vector tempVector2 = new Vector();
        Vector tempVector3 = new Vector();
        Vector tempVector4 = new Vector();
        Vector tempVector5 = new Vector();
        Vector tempVector6 = new Vector();
        Vector tempVector7 = new Vector();
        Vector tempVector8 = new Vector();
        Vector tempVector9 = new Vector();
    DefaultTableModel model2 = new  DefaultTableModel();
      
    ArrayList<ArrayList<ArrayList<Object>>> tempArrayListFull = new ArrayList<ArrayList<ArrayList<Object>>>();
    int rowCount=0;
    
    
    public AtcDcp() {
        super();
     
       panel = new JPanel();
       frame = new JFrame();
       
     array2 = new Object [][]{
                
                {Boolean.FALSE, 1, 2, 3, 4},
                {Boolean.FALSE, 2, 1, 3, 5},
                {Boolean.FALSE, 3, 2, 1, 6},
                {Boolean.TRUE, 3, 1, 2, 7},
                {Boolean.FALSE, 1, 2, 3, 8},
                {Boolean.TRUE, 2, 1, 3, 9},
                {Boolean.TRUE, 3, 2, 1, 10},
                {Boolean.FALSE, 3, 1, 2, 11},
                {Boolean.FALSE, 3, 1, 2, 12},
             
         };
   
            for (int j = 0; j < array2[j].length; j++){
              tempVector1.add(array2[0][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector2.add(array2[1][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector3.add(array2[2][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector4.add(array2[3][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector5.add(array2[4][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector6.add(array2[5][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector7.add(array2[6][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector8.add(array2[7][j]);
     }
            for (int j = 0; j < array2[j].length; j++){
              tempVector9.add(array2[8][j]);
     }
            vlist2.clear();
            vlist2.add(tempVector1);
            vlist2.add(tempVector2);
            vlist2.add(tempVector3);
            vlist2.add(tempVector4);
            vlist2.add(tempVector5);
            vlist2.add(tempVector6);
            vlist2.add(tempVector7);
            vlist2.add(tempVector8);
            vlist2.add(tempVector9);
            
     Vector columnName= new Vector();
     columnName.add("CheckBox");
     columnName.add("Value1");
     columnName.add("Value2");
     columnName.add("Value3");
     columnName.add("Value4");
      
     model2.setDataVector(vlist2, columnName); 
     System.out.println(model2.getRowCount());
     rowCount=model2.getRowCount();
    

     table = new JTable(model2) {
                  
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Boolean.class;
                    case 1:
                        return Integer.class;
                    case 2:
                        return Integer.class;
                    case 3:
                        return Integer.class;
                    case 4:
                        return Integer.class;
                    default:
                        return Boolean.class;
                }
                
            }
             
        @Override
        public  Object  getValueAt( int row, int column){
        
            ArrayList<ArrayList<Object>> tempArrayList = new ArrayList<ArrayList<Object>>();
            for(int i=0; i<rowCount; i++){
                ArrayList <Object>subArrayList = new ArrayList<Object>();
                for(int j=0; j<1; j++){
                    subArrayList.add(i);
                    subArrayList.add(model2.getValueAt(i, 0));
                    tempArrayList.add(subArrayList);
                }
            }
            ArrayList<ArrayList<Object>> tempArrayList2 = new ArrayList<ArrayList<Object>>();
            for(int i=0; i<rowCount; i++){
                ArrayList <Object>subArrayList = new ArrayList<Object>();
                for(int j=0; j<1; j++){
                    subArrayList.add(i);
                    subArrayList.add(model2.getValueAt(i, 0));
                    tempArrayList2.add(subArrayList);
                }
            }
            
                tempArrayListFull.add(0, tempArrayList);
                tempArrayListFull.add(1, tempArrayList2);
                
            ArrayList<ArrayList<Object>> editArrayList = new ArrayList<ArrayList<Object>>();  
            ArrayList<ArrayList<Object>> editArrayList2 = new ArrayList<ArrayList<Object>>();
            for(int i=0; i<1; i++){
                editArrayList = tempArrayListFull.get(i);
                editArrayList2 = tempArrayListFull.get(i+1);
                for(int j=0; j<editArrayList.size(); j++){
                   ArrayList <Object>editList = new <Object>ArrayList();
                   ArrayList <Object>editList2 = new <Object>ArrayList();
                   editList = (ArrayList<Object>) editArrayList.get(j);
                   editList2 = (ArrayList<Object>) editArrayList2.get(j);
                    if(editList.get(1).equals(Boolean.TRUE) && editList2.get(1).equals(Boolean.TRUE) 
                       ){
                        editList.set(1, aVal);
                        editList2.set(1, aVal2);
                        }else{
                        editList.set(1, aVal2);
                        editList2.set(1, aVal);
                        }
                       }
                }
        ArrayList<ArrayList<Object>> InvertedArrayList = new ArrayList<ArrayList<Object>>();    
        ArrayList<ArrayList<Object>> InvertedArrayList2 = new ArrayList<ArrayList<Object>>();
        InvertedArrayList = tempArrayListFull.get(0);
        InvertedArrayList2 = tempArrayListFull.get(1);
        
        ArrayList<Object> ForEditingModelList = new ArrayList<Object>();
        ArrayList <Object>boolArrayListI = new <Object>ArrayList();
        ArrayList <Object>boolArrayListIEcho = new <Object>ArrayList();
        ArrayList <Object>boolArrayListIEchoM = new <Object>ArrayList();
        for(int i=0; i<rowCount; i++){
            ForEditingModelList.clear();
            ForEditingModelList = InvertedArrayList.get(i);
            Object boolValue=ForEditingModelList.get(1);
              boolArrayListI.add(boolValue); 
              boolArrayListIEcho.add(boolValue);
              boolArrayListIEchoM.add(boolValue);
              }
        
        ArrayList<Object> ForEditingModelList2 = new ArrayList<Object>();
        ArrayList <Object>boolArrayListE = new <Object>ArrayList();
        ArrayList <Object>boolArrayListEEcho = new <Object>ArrayList();
        ArrayList <Object>boolArrayListEEchoM = new <Object>ArrayList();
        
        for(int i=0; i<rowCount; i++){
            ForEditingModelList2.clear();
            ForEditingModelList2 = InvertedArrayList2.get(i);
            Object boolValue=ForEditingModelList2.get(1);
              boolArrayListE.add(boolValue); 
              boolArrayListEEcho.add(boolValue);
              boolArrayListEEchoM.add(boolValue);
              }
   
        for(int i = 0, j = boolArrayListIEchoM.size() - 1; i < j; i++) {
        boolArrayListIEchoM.add(i, boolArrayListIEchoM.remove(j));
    }
        for(int i = 0, j = boolArrayListEEchoM.size() - 1; i < j; i++) {
        boolArrayListEEchoM.add(i, boolArrayListEEchoM.remove(j));
    }
         
            int j=0;
            int i2=0;
            int j2=0;
            Object aValue2=(Object)aVal;
/******/for(int i =rowCount; i>0; i--){
            j=rowCount-i;
                     
           Object aValueExisted = boolArrayListE.get(i-1); 
           Object aValueInverted = boolArrayListI.get(i-1); 
           Object aValueInvertedEchoBecomesExist = boolArrayListIEchoM.get(j); 
           Object aValueExistedEchoBecomesInvert = boolArrayListEEchoM.get(j); 
           
           j2=i;
           i2=j;
           Object aValueExistedn = boolArrayListE.get(i2); 
           Object aValueInvertedn = boolArrayListI.get(i2); 
           Object aValueInvertedEchoBecomesExistn = boolArrayListIEchoM.get(j2-1); 
           Object aValueExistedEchoBecomesInvertn = boolArrayListEEchoM.get(j2-1); 
           //first
           if(aValueExisted.equals(aValueExistedEchoBecomesInvert) &&                     //1
                aValueExistedEchoBecomesInvert.equals(aValueExistedEchoBecomesInvertn)&&  //2
                 aValueExistedEchoBecomesInvertn.equals(aValueExisted)&&                  //3
                  aValueExisted.equals(aValueExistedn)&&                                  //4
                 aValueExistedn.equals(aValueExistedEchoBecomesInvert)&&                  //5
                   aValueExistedEchoBecomesInvert.equals(aValueExisted)&&                 //6
                   
                //second 
                   aValueExistedn.equals(aValueExistedEchoBecomesInvertn)&&                //7
                  aValueExistedEchoBecomesInvertn.equals(aValueExistedEchoBecomesInvert)&& //8
                   aValueExistedEchoBecomesInvert.equals(aValueExistedn)&&                 //9
                   aValueExistedn.equals(aValueExisted)&&                                  //10
                   aValueExisted.equals(aValueExistedEchoBecomesInvertn)&&                 //11
                   aValueExistedEchoBecomesInvertn.equals(aValueExistedn) &&               //12
               
                 //////////////2*6=12 above
                 //////////////12 below (includes 4*2=8 corner interconnections)
                   aValueExisted.equals(aValueExistedEchoBecomesInvert) &&                  //13
                   aValueExistedEchoBecomesInvert.equals(aValueExisted)&&                   //14
                   aValueExisted.equals(aValueExistedn)&&                                   //15
                   aValueExistedn.equals(aValueExistedEchoBecomesInvertn)&&                 //16
                   
                   aValueExistedEchoBecomesInvertn.equals(aValueExistedn)&&                 //17
                   aValueExistedn.equals(aValueExistedEchoBecomesInvert)&&                  //18
                   aValueExistedEchoBecomesInvert.equals(aValueExistedEchoBecomesInvertn)&& //19
                   aValueExistedEchoBecomesInvertn.equals(aValueExisted)&&                  //20
                   
                   aValueExisted.equals(aValueExistedEchoBecomesInvertn)&&                  //21
                   aValueExistedEchoBecomesInvertn.equals(aValueExistedEchoBecomesInvert)&& //22
                   aValueExistedEchoBecomesInvert.equals(aValueExistedn)&&                  //23
                   aValueExistedn.equals(aValueExisted))                                    //24
                                  
                 {                        
                 setValueAt(aValueInvertedEchoBecomesExist, i-1, 0);                        //1
                 setValueAt(aValueInvertedEchoBecomesExistn, j, 0);                         //2
                 setValueAt(aValueInverted, j2-1, 0);                                       //3
                 setValueAt(aValueInvertedn, i-1, 0);                                       //4
                 setValueAt(aValueInvertedEchoBecomesExist, i2, 0);                         //5
                 setValueAt(aValueInverted, j, 0);                                          //6
                 
                 setValueAt(aValueInvertedEchoBecomesExistn, i2, 0);                        //7
                 setValueAt(aValueInvertedEchoBecomesExist, j2-1, 0);                       //8
                 setValueAt(aValueInvertedn, j, 0);                                         //9
                 setValueAt(aValueInverted, i2, 0);                                         //10
                 setValueAt(aValueInvertedEchoBecomesExistn, i-1, 0);                       //11
                 setValueAt(aValueInvertedn, j2-1, 0);                                      //12
                                               
                 /////////2*6 above
                 //////12 square below includes 4*2 corner interconnections
                 setValueAt(aValueInvertedEchoBecomesExist, i-1, 0);                        //13
                 setValueAt(aValueInverted, j, 0);                                          //14
                 setValueAt(aValueInvertedn, i-1, 0);                                       //15
                 setValueAt(aValueInvertedEchoBecomesExistn, i2, 0);                        //16
                                 
                 setValueAt(aValueInverted, j2-1, 0);                                       //17
                 setValueAt(aValueInvertedEchoBecomesExist, i2, 0);                         //18
                 setValueAt(aValueInvertedEchoBecomesExistn, j, 0);                         //19
                 setValueAt(aValueInverted, j2-1, 0);                                       //20
                 
                 setValueAt(aValueInvertedEchoBecomesExistn, i-1, 0);                        //21
                 setValueAt(aValueInvertedEchoBecomesExist, j2-1, 0);                        //22
                 setValueAt(aValueInvertedn, j, 0);                                          //23
                 setValueAt(aValueInverted, i2, 0);                                          //24
                                 
                 j++; 
             }     
            
             } 
       
           return model2.getValueAt(row,column);
            }
         
        
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) { 
  
        return true;           
        }      
};
        panel.add(table); 
       
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                AtcDcp atcdcp2 = new AtcDcp();
                atcdcp2.add(panel);
                frame.add(atcdcp2);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
                                
                frame.setBounds(1050, 350, 500, 400);
                
                 frame.pack();
               frame.setVisible(true);
                     
            }
        });
    }
}

    

