package lab_16_serialization_fileIO.quickCardGame;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class QuizCardPlayer {
    private List<QuizCard> cardList = new ArrayList<>();
    private QuizCard currentQuiz;
    private int currentCardIndex;
    private JFrame frame;
    private JTextArea question;
    private JTextArea answer;
    private JButton showAnswer;
    private JButton nextCard;

    private boolean isShowAnswer = false;

    public static void main(String[] args) {
        new QuizCardPlayer().go();
    }

    /*
    setup the GUI
    * */
    public void go(){
        frame = new JFrame("Quiz Card Player");
        Font bigFont = new Font("sanserif",Font.BOLD,20);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));

        
        //menu File - Open, Close
        JMenuBar menu = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem fileOpen = new JMenuItem("Open");
        fileOpen.addActionListener(e -> loadFile());
        fileMenu.add(fileOpen);
        menu.add(fileMenu);
        frame.setJMenuBar(menu);
        
        //question textArea into panel
        JLabel questionLbl = new JLabel("Question");
        JLabel answerLbl = new JLabel("Answer");
        question = new JTextArea();
        answer = new JTextArea();
        mainPanel.add(questionLbl);
        mainPanel.add(question);
        mainPanel.add(answerLbl);
        mainPanel.add(answer);
        
        //button showAnswer, nextCard
        showAnswer = new JButton("Show Answer");
        showAnswer.addActionListener(e -> showAnswer());
        nextCard = new JButton("Next Card");
        nextCard.addActionListener(e -> nextCard());
        JPanel buttonBottomArea = new JPanel();
        buttonBottomArea.add(showAnswer);
        buttonBottomArea.add(nextCard);
        mainPanel.add(buttonBottomArea);
        
        frame.getContentPane().add(mainPanel,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void nextCard() {
        isShowAnswer = true;
        //clear display of the old question
        question.setText("");
        answer.setText("");
        //increase index
        if(currentCardIndex < cardList.size()-1){
            currentCardIndex += 1;
            QuizCard randCard = cardList.get(currentCardIndex);
            question.setText(randCard.getQuestion());
            answer.setFocusable(true);
        }else{
            question.setText("NO MORE CARD !");
            nextCard.setVisible(false);
            showAnswer.setVisible(false);
        }

    }

    private void loadFile() {
        //1.read file from path that user choose
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(frame);
        File selectedFile = file.getSelectedFile();
        BufferedReader reader = null;
        try {
            FileReader fileReader = new FileReader(selectedFile.getAbsoluteFile());
            reader = new BufferedReader(fileReader);
            String line;
            //2.read line by line then make Quiz object
            while((line = reader.readLine()) != null){
                QuizCard card = makeCard(line);
                //3.save Quiz object into the cardList
                cardList.add(card);
            }

            //3. set the first card as current card index
            if(cardList.size()>0){
                currentCardIndex = 0;
                currentQuiz = cardList.get(0);
                question.setText(currentQuiz.getQuestion());
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { //add finally block, move reader.close()into the finally block
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private QuizCard makeCard(String line) {
        String[] splits = line.split("[/]");
        String question = splits[0].trim();
        String answer = splits[1].trim();
        return new QuizCard(question,answer);
    }

    private void showAnswer() {
        answer.setText(cardList.get(currentCardIndex).getAnswer());
    }
}
