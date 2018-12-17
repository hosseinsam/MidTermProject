package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.*;

/**
 * Created by hossein on 12/17/2018.
 */
public class GameControl implements Initializable{
    @FXML
    AnchorPane gamePane;
    @FXML
    Label ScoreLabel;
    @FXML
    Label TimeLabel;
    @FXML
    Circle ballShape;
    @FXML
    Rectangle rectangleShape;
    @FXML
    Rectangle gameErorr1;
    @FXML
    Rectangle gameErorr2;
    @FXML
    Rectangle gameErorr3;
    @FXML
    Label scoreSet;
    @FXML
    Label timeSet;
    @FXML
    Label gameF;

    Scanner sc = new Scanner(System.in);

    int interval=30;
    private int score = 1;
    private int timert = 0;
    private Random random = new Random();
    Timer timer;

    public GameControl() throws FileNotFoundException {
    }

    public void setTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if(interval > 0)
                {
                    Platform.runLater(() -> timeSet.setText(""+interval));

                    interval--;

                }else if(interval == 0){
                    try(PrintWriter a = new PrintWriter("score.txt")){
                        a.println(Main.users.get(Main.users.size()-1).getScore());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
                else
                    timer.cancel();

            }
        }, 1000,1000);
    }

    public void WButton(ActionEvent actionEvent) throws IOException {

        ballShape.setLayoutY(ballShape.getLayoutY() - 5);
        if (((ballShape.getLayoutX() > 465 || ballShape.getLayoutX() < 12) || (ballShape.getLayoutY() > 12 || ballShape.getLayoutY() < 367))  || ((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
            score = score - 30;
            scoreSet.setText("" + score);
            ballShape.setLayoutY(ballShape.getLayoutY() + 7);
        } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
            interval = interval+30;
            score = score + 100;
            scoreSet.setText("" + score);
            rectangleShape.setLayoutX(random.nextInt(366));
        }

    }

    public void DButton(ActionEvent actionEvent) {

        ballShape.setLayoutX(ballShape.getLayoutX() + 5);
        if (((ballShape.getLayoutX() > 465 || ballShape.getLayoutX() < 12) || (ballShape.getLayoutY() > 12 || ballShape.getLayoutY() < 367))  || ((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
            score = score - 30;
            scoreSet.setText("" + score);
            ballShape.setLayoutX(ballShape.getLayoutX() - 7);
        } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
            interval = interval+20;
            score = score + 100;
            scoreSet.setText("" + score);
            rectangleShape.setLayoutX(random.nextInt(366));
        }
    }

    public void SButton(ActionEvent actionEvent)  {

        ballShape.setLayoutY(ballShape.getLayoutY() + 5);
        if (((ballShape.getLayoutX() > 465 || ballShape.getLayoutX() < 12) || (ballShape.getLayoutY() > 12 || ballShape.getLayoutY() < 367))  || ((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
            score = score - 30;
            scoreSet.setText("" + score);
            ballShape.setLayoutY(ballShape.getLayoutY() - 7);
        } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
            interval = interval+20;
            score = score + 100;
            scoreSet.setText("" + score);
            rectangleShape.setLayoutX(random.nextInt(366));
        }
    }

    public void AButton(ActionEvent actionEvent) {
        ballShape.setLayoutX(ballShape.getLayoutX() - 5);

        if (((ballShape.getLayoutX() > 465 || ballShape.getLayoutX() < 12) || (ballShape.getLayoutY() > 12 || ballShape.getLayoutY() < 367))  ||   ((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
            score = score - 30;
            scoreSet.setText("" + score);
            ballShape.setLayoutX(ballShape.getLayoutX() + 7);
        } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
            interval = interval+20;
            score = score + 100;
            scoreSet.setText("" + score);
            rectangleShape.setLayoutX(random.nextInt(366));
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTimer();

    }

    public void r(KeyEvent keyEvent) {
        if (keyEvent.getText().equals("w")){
            ballShape.setLayoutY(ballShape.getLayoutY() - 5);
            if (((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
                score = score - 30;
                scoreSet.setText("" + score);
                ballShape.setLayoutY(ballShape.getLayoutY() + 7);
            } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
                interval = interval+20;
                score = score + 100;
                scoreSet.setText("" + score);
                rectangleShape.setLayoutX(random.nextInt(366));
            }
        }else if (keyEvent.getText().equals("s")){
            ballShape.setLayoutY(ballShape.getLayoutY() + 5);
            if (((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
                score = score - 30;
                scoreSet.setText("" + score);
                ballShape.setLayoutY(ballShape.getLayoutY() - 7);
            } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
                interval = interval+20;
                score = score + 100;
                scoreSet.setText("" + score);
                rectangleShape.setLayoutX(random.nextInt(366));
            }
        }else if (keyEvent.getText().equals("a")){
            ballShape.setLayoutX(ballShape.getLayoutX() - 5);

            if (((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
                score = score - 30;
                scoreSet.setText("" + score);
                ballShape.setLayoutX(ballShape.getLayoutX() + 7);
            } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
                interval = interval+20;
                score = score + 100;
                scoreSet.setText("" + score);
                rectangleShape.setLayoutX(random.nextInt(366));
            }
        }else if (keyEvent.getText().equals("d")){
            ballShape.setLayoutX(ballShape.getLayoutX() + 5);
            if (((ballShape.getLayoutX() > 121 && ballShape.getLayoutX() < 159) && (ballShape.getLayoutY() > 138 && ballShape.getLayoutY() < 362)) || ((ballShape.getLayoutX() > 191 && ballShape.getLayoutX() < 229) && (ballShape.getLayoutY() > 10 && ballShape.getLayoutY() < 212)) || ((ballShape.getLayoutX() > 290 && ballShape.getLayoutX() < 329) && (ballShape.getLayoutY() > 168 && ballShape.getLayoutY() < 380))) {
                score = score - 30;
                scoreSet.setText("" + score);
                ballShape.setLayoutX(ballShape.getLayoutX() - 7);
            } else if ((ballShape.getLayoutX() > rectangleShape.getLayoutX() && ballShape.getLayoutX() < rectangleShape.getLayoutX() + 31) && (ballShape.getLayoutY() > rectangleShape.getLayoutY() && ballShape.getLayoutY() < rectangleShape.getLayoutY() + 31)) {
                interval = interval+20;
                score = score + 100;
                scoreSet.setText("" + score);
                rectangleShape.setLayoutX(random.nextInt(366));
            }
        }
    }


}
//    public void gameMain(){
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            String ch = sc.next();
//            if (ch.equals("w")||ch.equals("W")){
//                ballShape.setLayoutY(ballShape.getLayoutY()-5);
//            }else if (ch.equals("S")||ch.equals("s")){
//                ballShape.setLayoutY(ballShape.getLayoutY()+5);
//            }else if (ch.equals("a")||ch.equals("A")){
//                ballShape.setLayoutX(ballShape.getLayoutX()-2);
//            }else if (ch.equals("d")||ch.equals("D")){
//                ballShape.setLayoutX(ballShape.getLayoutX()+2);
//            }
//
//
//
//        }
//    }
///////////////////
//    int xb_me = (int) Math.abs(ballShape.getCenterX()-(gameErorr1.getX()+7));
//    int yb_me = (int) Math.abs(ballShape.getCenterY() - (gameErorr1.getY()+100));
//        if (xb_me < 5 && yb_me<112){
//        System.out.println("fdygvjsvnhdj;kwjmdksmklmvs");
//        }