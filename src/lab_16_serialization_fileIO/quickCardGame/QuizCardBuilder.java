package lab_16_serialization_fileIO.quickCardGame;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuizCardBuilder {
    private List<QuizCard> cardList = new ArrayList<>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) {
        new QuizCardBuilder().go();
    }

    public void go(){
        //init frame
        frame = new JFrame("Quiz Card Game");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("Serif",Font.BOLD,24);

        //put textbox question answer on GUI
        JLabel questionLbl = new JLabel("Question",SwingConstants.CENTER);
        JLabel answerLbl = new JLabel("Answer",SwingConstants.CENTER);
        question = createTextArea(bigFont);
        JScrollPane qScroller = createScroller(question);
        answer = createTextArea(bigFont);

        //add button
        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(e -> nextCard());

        //add menu from: menuBar, menu, menuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e->clearAll());
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(e->saveCard());
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        //add components to pane
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        mainPanel.add(questionLbl);
        mainPanel.add(question);
        mainPanel.add(answerLbl);
        mainPanel.add(answer);
        mainPanel.add(nextButton);

        //add to frame
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setVisible(true);
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void saveCard() {
        //1. save to the cardList object
        String question = this.question.getText();
        String answer = this.answer.getText();
        QuizCard card = new QuizCard(question,answer);
        cardList.add(card);
        cardList.forEach(s -> System.out.println(s));

        //2. save to file
        JFileChooser fileSave = new JFileChooser();
        fileSave.showSaveDialog(frame);
        File file = fileSave.getSelectedFile();
        System.out.println(file.getAbsolutePath());//use for debug
        saveFile(file);
    }

    private void saveFile(File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);
            for (QuizCard quizCard : cardList) {
                object.writeObject(quizCard);
            }
            object.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void clearAll() {
        cardList.clear();
        clearCard();
    }

    private void nextCard() {
        QuizCard card = new QuizCard(question.getText(),answer.getText());
        //need to save card
        cardList.add(card);
        clearCard();

    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.setFocusable(true);
    }

    public JTextArea createTextArea(Font bigFont){
        JTextArea textArea = new JTextArea(6,20);
        textArea.setFont(bigFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }

    public JScrollPane createScroller(JTextArea textArea){
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scrollPane;
    }
}
