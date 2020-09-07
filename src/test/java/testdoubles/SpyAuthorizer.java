package testdoubles;

public class SpyAuthorizer implements Authorizer {
    private int numberOfCall = 0;

    @Override
    public Boolean authorize(String username, String password) {
        numberOfCall++;
        return true;
    }

    @Override
    public void addAuthorized(String username) {

    }

    public int numberOfauthorizeCall() {
        return numberOfCall;
    }
}
