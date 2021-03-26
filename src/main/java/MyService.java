public class MyService {
    public UserInput myModel;
    public MyService(UserInput myModel) {
        this.myModel = myModel;
    }

    public Boolean shouldSendEmail(String isMatchedWithNext) {
        return myModel.getNextInput().equals(isMatchedWithNext);
    }
}
