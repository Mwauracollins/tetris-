package gui;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    private final int blockSize;
    private final int numBlocksInWidth;
    private final int numBlocksInHeight;
    private static final Color BOARD_PANEL_COLOR = Color.DARK_GRAY;
    private  final  Dimension BOARD_PANEL_DIMENSION;
    public BoardPanel(int blockSize, int numBlocksInWidth, int numBlocksInHeight){
        this.blockSize = blockSize;
        this.numBlocksInWidth = numBlocksInWidth;
        this.numBlocksInHeight = numBlocksInHeight;

        int boardWidth = numBlocksInWidth * blockSize;
        int boardHeight = numBlocksInHeight * blockSize;

        this.BOARD_PANEL_DIMENSION = new Dimension(boardWidth, boardHeight);
        this.setPreferredSize(BOARD_PANEL_DIMENSION);
        this.setBackground(BOARD_PANEL_COLOR);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < numBlocksInHeight; row++){
            for (int column = 0; column < numBlocksInWidth; column++){
                int x = column * blockSize;
                int y = row * blockSize;
                g.drawRect(x, y, blockSize, blockSize);
            }
        }
    }
}