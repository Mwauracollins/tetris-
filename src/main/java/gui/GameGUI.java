package gui;

import game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI {
    private final BoardPanel boardPanel;
    private final ScorePanel scorePanel;
    private final QueuePanel queuePanel;

    private final JFrame gameFrame;
    private final JMenuBar gameMenuBar;

    private static final int BLOCK_SIZE = 30;
    private static final int NUM_BLOCKS_VERTICAL = 15;
    private static final int NUM_BLOCKS_HORIZONTAL = 10;

    public GameGUI(){
        this.gameFrame = new JFrame("Tetris");
        this.gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.gameMenuBar = new JMenuBar();
        createMenuBar(this.gameMenuBar);
        this.gameFrame.setJMenuBar(gameMenuBar);

        this.boardPanel = new BoardPanel(BLOCK_SIZE, NUM_BLOCKS_HORIZONTAL, NUM_BLOCKS_VERTICAL);
        this.gameFrame.add(this.boardPanel, BorderLayout.CENTER);

        this.scorePanel = new ScorePanel();
        this.gameFrame.add(this.scorePanel, BorderLayout.WEST);

        this.queuePanel = new QueuePanel();
        this.gameFrame.add(this.queuePanel, BorderLayout.EAST);

        this.gameFrame.pack();
        this.gameFrame.setVisible(true);
    }

    private void createMenuBar(JMenuBar gameMenuBar) {
        gameMenuBar.add(createStartGameMenu());
    }

    private JMenu createStartGameMenu() {
        final JMenu startGameMenu = new JMenu("Start Game");

        final JMenuItem offlinePlay = new JMenuItem("Offline Play");
        offlinePlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Create an instance of offline PLay
            }
        });
        startGameMenu.add(offlinePlay);

        final JMenuItem onlinePlay = new JMenuItem("Online Play");
        onlinePlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Create an online instance of the game
            }
        });
        startGameMenu.add(onlinePlay);

        return startGameMenu;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                GameGUI gui = new GameGUI();
            }
        };
        SwingUtilities.invokeLater(r);
    }
}