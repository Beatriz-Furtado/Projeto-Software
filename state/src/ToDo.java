package src;

public class ToDo implements States{
    protected UserStorie userStorie;
    @Override
    public void moveUS(UserStorie us, Equipe userEquipe) {
        States newState = new InProgress();
        this.userStorie.setState(newState);
    }
}
