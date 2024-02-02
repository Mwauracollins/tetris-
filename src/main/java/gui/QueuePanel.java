package gui;

import javax.swing.*;
import java.awt.*;


public class QueuePanel extends JPanel {
    private static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 18);
    private static final Font PIECE_FONT = new Font("Arial", Font.PLAIN, 16);
    private static final Color QUEUE_PANEL_COLOR = Color.LIGHT_GRAY;
    private static final Dimension QUEUE_PANEL_DIMENSION = new Dimension(100, 200);

    private JLabel titleLabel;
    private JLabel[] pieceLabel;

    public QueuePanel(){
        this.setBackground(QUEUE_PANEL_COLOR);
        this.setPreferredSize(QUEUE_PANEL_DIMENSION);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        initializeLabels();
        updateQueuePanel(new int[]{1, 2, 3, 4, 5});//TODO: REMOVE DUMMY DATA

    }

    private void updateQueuePanel(int[] upcomingPieces) {
        for (int i = 0; i < pieceLabel.length; i++){
            pieceLabel[i].setText("Piece " + upcomingPieces[i]);
        }
    }

    private void initializeLabels() {
        titleLabel = createLabel("Next Piece: ");
        add(titleLabel);

        pieceLabel = new JLabel[5];
        for (int i = 0; i < pieceLabel.length; i++){
            pieceLabel[i] = createLabel("");
            add(pieceLabel[i]);
        }

    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(text.equals("Next Piece:") ? TITLE_FONT : PIECE_FONT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }
}