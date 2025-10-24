    import javax.swing.*;
    import java.awt.*;

    public class GameGUI extends JFrame {
        private JPanel gamePanel;
        private CardLayout gameCardLayOut;
        private Hero[] myTeam;
        private Hero[] enemyTeam;
        private boolean isAi = true;

        public GameGUI() {
            gameCardLayOut = new CardLayout();
            gamePanel = new JPanel(gameCardLayOut);

            setTitle("Shadows of Eldora");
            setSize(900, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

           
            JPanel mainScreen = CreateMainScreen();
            JPanel gameModeScreen = CreateGameModeScreen();
            JPanel playScreen = CreatePlayScreen();
            JPanel selectionScreen = CreateSelectionScreen();
            
            
            gamePanel.add(mainScreen, "MainScreen");
            gamePanel.add(gameModeScreen, "GameMode");
            gamePanel.add(playScreen, "PlayScreen");
             gamePanel.add(selectionScreen, "SelectionScreen");
            
            add(gamePanel);
            
            
            gameCardLayOut.show(gamePanel, "MainScreen");
            
            setVisible(true); 
        }
        public JPanel CreatePlayScreen() {
            JPanel playScreen = new JPanel(new BorderLayout());
            playScreen.setBackground(new Color(40, 40, 60)); 

            // 
            JPanel play_Intro = new JPanel(new BorderLayout());
            play_Intro.setBackground(new Color(40, 40, 60));

            JTextArea play_Story = new JTextArea(
                "Long ago, the peaceful village of Eldonia was destroyed by the Overlord of Shadows, " +
                "leaving five childhood friends as its only survivors. Adrian the Warrior, Jhush the " +
                "Assassin, Cyberg the Mage, Rex the Archer, and Clarence the Tank swore a blood oath " +
                "to fight as brothers and avenge their fallen home.\n\n" +
                "Each trained in their own discipline: strength, speed, magic, precision, and defense, " +
                "becoming the last sons of Eldonia. United by brotherhood and destiny, they now battle " +
                "together to restore light to the kingdom."
            );
            play_Story.setForeground(Color.WHITE);
            play_Story.setFont(new Font("trajanpro_bold", Font.PLAIN, 18));
            play_Story.setBackground(new Color(40, 40, 60));
            play_Story.setEditable(false);
            play_Story.setFocusable(false);
            play_Story.setLineWrap(true);
            play_Story.setWrapStyleWord(true);
            play_Story.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

           
            JScrollPane scrollPane = new JScrollPane(play_Story);
            scrollPane.setBorder(null);
            scrollPane.setBackground(new Color(40, 40, 60));
            scrollPane.getViewport().setBackground(new Color(40, 40, 60));

            play_Intro.add(scrollPane, BorderLayout.CENTER);

           
            JPanel play_ButtonPanel = new JPanel();
            play_ButtonPanel.setBackground(new Color(40, 40, 60));

            JButton play_Continue = new JButton("CONTINUE");
            play_Continue.setFont(new Font("trajanpro_bold", Font.BOLD, 32));
            play_Continue.setForeground(Color.WHITE);
            play_Continue.setFocusPainted(false);
            play_Continue.setContentAreaFilled(false);
            play_Continue.setBorderPainted(false);
            play_Continue.setOpaque(false);
            play_Continue.setCursor(new Cursor(Cursor.HAND_CURSOR));

            play_ButtonPanel.add(play_Continue);

            play_Continue.addActionListener(e -> {
                gameCardLayOut.show(gamePanel, "SelectionScreen");
            });

           
            playScreen.add(play_Intro, BorderLayout.CENTER);
            playScreen.add(play_ButtonPanel, BorderLayout.SOUTH);

            return playScreen;
        }
        public JPanel CreateSelectionScreen(){
            JPanel selection_Screen = new JPanel();
            return selection_Screen;
        }
        public JPanel CreateMainScreen() {
            JPanel menuPanel = new JPanel(new BorderLayout());
            menuPanel.setBackground(new Color(40, 40, 60));

            
            JPanel centerPanel = new JPanel(new BorderLayout());
            centerPanel.setOpaque(false);

            JLabel menu_Logo = new JLabel("Shadows of Eldora");
            menu_Logo.setFont(new Font("trajanpro_bold", Font.BOLD, 48));
            menu_Logo.setForeground(Color.WHITE);
            menu_Logo.setHorizontalAlignment(SwingConstants.CENTER);
            menu_Logo.setBorder(BorderFactory.createEmptyBorder(100, 0, 100, 0));

            JPanel menu_Button = new JPanel(new GridLayout(3, 1, 15, 15));
            menu_Button.setBackground(new Color(40, 40, 60));
            menu_Button.setBorder(BorderFactory.createEmptyBorder(0, 300, 200, 300));

            JButton playButton = new JButton("Play");
            JButton gameModeButton = new JButton("Game Mode");
            JButton exitButton = new JButton("Exit");

            
            JButton[] buttons = {playButton, gameModeButton, exitButton};
            for (JButton b : buttons) {
                b.setFont(new Font("trajanpro_bold", Font.BOLD, 32));
                b.setForeground(Color.WHITE);
                b.setFocusPainted(false);
                b.setContentAreaFilled(false);
                b.setBorderPainted(false);
                b.setOpaque(false);
                b.setCursor(new Cursor(Cursor.HAND_CURSOR));
                menu_Button.add(b);
            }
            playButton.addActionListener(e -> gameCardLayOut.show(gamePanel,"PlayScreen"));
            gameModeButton.addActionListener(e -> gameCardLayOut.show(gamePanel, "GameMode"));
            exitButton.addActionListener(e -> System.exit(0));

            centerPanel.add(menu_Logo, BorderLayout.NORTH);
            centerPanel.add(menu_Button, BorderLayout.CENTER);

            menuPanel.add(centerPanel, BorderLayout.CENTER);

            return menuPanel;
        }
        public JPanel CreateGameModeScreen() {
        JPanel settingPanel = new JPanel(new BorderLayout());
        settingPanel.setBackground(new Color(40, 40, 60));

        JPanel setting_Center = new JPanel();
        setting_Center.setLayout(new BoxLayout(setting_Center, BoxLayout.Y_AXIS));
        setting_Center.setBackground(new Color(40, 40, 60));

        JButton setting_PVP = new JButton("PLAYER VS PLAYER");
        JButton setting_PVAI = new JButton("PLAYER VS AI");
        JButton[] buttons = {setting_PVP, setting_PVAI};

        for (JButton b : buttons) {
            b.setFont(new Font("trajanpro_bold", Font.BOLD, 32));
            b.setForeground(Color.WHITE);
            b.setFocusPainted(false);
            b.setContentAreaFilled(false);
            b.setBorderPainted(false);
            b.setOpaque(false);
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));

            b.setAlignmentX(Component.CENTER_ALIGNMENT); 
            setting_Center.add(Box.createRigidArea(new Dimension(0, 30))); 
            setting_Center.add(b);
        }
        JPanel wrapper = new JPanel(new GridBagLayout());
            wrapper.setBackground(new Color(40, 40, 60));
            wrapper.add(setting_Center); 

        settingPanel.add(wrapper, BorderLayout.CENTER);
        setting_PVP.addActionListener(e ->{
            isAi = false;
            gameCardLayOut.show(gamePanel, "MainScreen");
        });
        setting_PVAI.addActionListener(e ->{
            isAi = true;
            gameCardLayOut.show(gamePanel, "MainScreen");
        });
        return settingPanel;
    }


        public static void main(String[] args) {
            new GameGUI();
        }
    }
