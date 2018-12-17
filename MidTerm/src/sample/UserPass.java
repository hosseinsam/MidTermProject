package sample;

/**
 * Created by hossein on 12/15/2018.
 */
public class UserPass {
    private String userName;
    private String password;
    private int Score;

    public UserPass(String userName, String password, int score) {
        this.userName = userName;
        this.password = password;
        Score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
