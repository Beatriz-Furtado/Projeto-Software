package src;
import java.util.List;

public class ScrumBoard {
    public Equipe userEquipe;
    public UserStorie userStorie;
    public List<UserStorie> usersStories;

    public ScrumBoard(Equipe userEquipe) {
        this.userEquipe = userEquipe;
    }

    public void setUserEquipe(Equipe newUserEquipe) {
        this.userEquipe = newUserEquipe;
    }

    public void createUS() {
        UserStorie newUS = new UserStorie();
        usersStories.add(newUS);
    }

    public void moveUS(UserStorie us) {
        userStorie.moveUS(us, this.userEquipe);
    }

    public void aprovedUS(UserStorie us) {
        us.setAproved();
    }

    public Equipe getUserEquipe() {
        return userEquipe;
    }
}
