package src;

public class ToVerify implements States{
    protected UserStorie userStorie;
    @Override
    public void moveUS(UserStorie us, Equipe userEquipe) {
         if (userEquipe.equals(new ScrumMaster()) && this.userStorie.getAproved()) {
         States newState = new Done();
         this.userStorie.setState(newState);
         }

         if (userEquipe.equals(new ScrumMaster())  && !this.userStorie.getAproved()) {
         States newState = new ToDo();
         this.userStorie.setState(newState);
         }
    }
}
