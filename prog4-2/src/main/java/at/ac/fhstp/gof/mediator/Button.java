package at.ac.fhstp.gof.mediator;

public class Button {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        this.mediator.press();
    }
}
