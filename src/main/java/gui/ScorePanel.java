package gui;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {
    private static final Font LABEL_FONT = new Font("Arial", Font.BOLD,20);
    private static final Font VALUE_FONT = new Font("Arial", Font.PLAIN, 20);
    private static final  Dimension SCORE_PANEL_DIMENSION = new Dimension(200, 200);
    private static final Color SCORE_PANEL_COLOR = Color.decode("#FFA23A");

    private JLabel scoreLabel;
    private JLabel levelLabel;
    private JLabel linesClearedLabel;

    public ScorePanel(){
        this.setBackground(SCORE_PANEL_COLOR);
        this.setPreferredSize(SCORE_PANEL_DIMENSION);
        this.setLayout(new GridLayout(0,1, 10, 10));

        initializeLabels();
        updateScorePanel(1000, 2, 15);//TODO REMOVE DUMMY DATA
    }

    private void initializeLabels() {
        scoreLabel = createLabel("Score:");
        add(scoreLabel);

        levelLabel = createLabel("Level:");
        add(levelLabel);

        linesClearedLabel = createLabel("Lines Cleared:");
        add(linesClearedLabel);

        add(createValueLabel(""));
        add(createValueLabel(""));
        add(createValueLabel(""));

    }
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(LABEL_FONT);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        return label;
    }
    private JLabel createValueLabel(String value) {
        JLabel label = new JLabel(value);
        label.setFont(VALUE_FONT);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        return label;
    }
    public void updateScorePanel(int score, int level, int linesCleared){
        updateValueLabel(scoreLabel, "Score: ", score);
        updateValueLabel(levelLabel, "Level: ", level);
        updateValueLabel(linesClearedLabel, "Lines Cleared: ", linesCleared);

    }

    private void updateValueLabel(JLabel label, String prefix, int value) {
        label.setText(prefix + value);
    }
}