package sw7;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * SolidWorks
 * 
 * @author H. Diethelm, Hochschule Luzern
 * @version 6.4.2008
 */
public class SolidWorks extends JFrame implements ActionListener
{
    private Cube[] solids;
    private ArrayList<Cube> solidss;
    private final String fileName = "soliddata.txt";
    // GUI Elemente erzeugen
    private final JButton bRead = new JButton("Read File '" + fileName + "'");
    private final JButton bSort1 = new JButton("Sort 'volume'");
    private final JButton bSort2 = new JButton("Sort 'surface'");
    private final JButton bSort3 = new JButton("Sort 'dimension'");
    private final JTextArea outputArea = new JTextArea();

    public SolidWorks()
    {
        super("SolidWorks");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        
        Container cp = getContentPane();
        JPanel p1 = new JPanel();
        
        p1.add(bRead);
        cp.add(p1, BorderLayout.NORTH);
        
        outputArea.setEditable(false);
        cp.add(new JScrollPane(outputArea), BorderLayout.CENTER);
        
        JPanel p2 = new JPanel();        
        p2.add(bSort1); p2.add(bSort2); p2.add(bSort3);
        cp.add(p2, BorderLayout.SOUTH);        

        // Listener registrieren
        bRead.addActionListener(this);
        bSort1.addActionListener(this);
        bSort2.addActionListener(this);
        bSort3.addActionListener(this);

        setVisible(true);       
    }
    
    private void doOutput()
    {
        outputArea.setText("");
        for (int i = 0; i < solids.length; i++){
            outputArea.append(solids[i].toString());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bRead){
            solids = SolidFileIO.readSolids(fileName);
            doOutput();
        }
        if ((e.getSource() == bSort1) && (solids != null)){
            Arrays.sort(solids);
            doOutput();
        }
        if ((e.getSource() == bSort2) && (solids != null)){
            SurfaceComparator sc = new SurfaceComparator();
            Arrays.sort(solids,sc);
            doOutput();
        }
        if ((e.getSource() == bSort3) && (solids != null)){
            MaxDimensionComparator mdc = new MaxDimensionComparator();
            Arrays.sort(solids,mdc);
            doOutput();
        }
    }
    
    public static void main(String[] args)
    {
        SolidWorks sw = new SolidWorks();
    }

}