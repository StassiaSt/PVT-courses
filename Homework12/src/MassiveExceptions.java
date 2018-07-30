public class MassiveExceptions extends Exception  {

    private String detail;

    MassiveExceptions(String details){
        this.detail=details;
    }

    @Override
    public String getMessage()

    {
        return "You have an error" + detail;
    }


}
