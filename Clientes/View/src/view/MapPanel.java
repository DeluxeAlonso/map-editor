



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.Manager;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import model.Map;

/**
 *
 * @author joca
 */
public class MapPanel extends javax.swing.JPanel {
    
    private Manager mMan = new Manager();
    private ImageRepository repo = new ImageRepository();
    int tile_width ;
    int tile_height;
    /**
     * Creates new form MapPanel
     */
    public MapPanel() {
        initComponents();
        tile_width = 25;
        tile_height = 28;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 153, 153));
        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  
    private int xPosToIso(int x, int y){
        return x-y;
    } 
    
    private int yPosToIso(int x, int y){
        return (x+y)/2;
    } 
    
    @Override
    public void paintComponent(Graphics g)
    {
        
        Map m = mMan.getM();
        if (m != null )
        {
            int cellsWidth = m.getWi();
            int cellsHeight = m.getHe();
            int horizontalOffset = (cellsWidth) *tile_width + 100;
            int vertical=20;
            int flag=0;
            for (int i = 0; i < cellsWidth; i++) {
                for (int j = 0; j < cellsHeight; j++) {
                    BufferedImage bf = repo.getImage(m.getCeldas()[i][j].getTerr().getNameField());
                    int x = xPosToIso(i*tile_width,j*tile_height);
                    int y = yPosToIso(i*tile_width,j*tile_height);
                    g.drawImage(bf, x +horizontalOffset, y+vertical, null);
        // g.drawImage(bf, x , y, null); 
                } 
            }
            for (int i = 0; i < cellsWidth ; i ++){
                for (int j = 0; j < cellsHeight ; j++){ 
                    model.Object elem = m.getCeldas()[i][j].getObject();
                    int x = xPosToIso(i*tile_width,j*tile_height);
                    int y = yPosToIso(i*tile_width,j*tile_height);
                    if (elem != null){
                        g.drawImage(repo.getImage(elem.getNombreObj()),x +horizontalOffset, y, null); 
                    }
                } 
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
