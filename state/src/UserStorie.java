package src;

public class UserStorie {
    protected States state;
    public Boolean aproved;

    public UserStorie() {
        this.state = new ToDo();
        this.aproved = false;
    }

    public void moveUS(UserStorie us, Equipe userEquipe) {
        this.state.moveUS(us, userEquipe);
    }

    public Boolean getAproved() {
        return this.aproved;
    }

    public States getState(){
        return this.state;
    }

    public void setState(States newState) {
        this.state = newState;
    }

    public void setAproved() {
        this.aproved = true;
    }
}
