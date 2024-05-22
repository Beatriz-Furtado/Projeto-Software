package src;

public class InProgress implements States{
    protected UserStorie userStorie;
    @Override
    public void moveUS(UserStorie us, Equipe userEquipe) {
        if (userEquipe.equals(new Desenvolvedores())) {
         States newState = new ToVerify();
         this.userStorie.setState(newState);
        }
    }
}
