import java.util.ArrayList;

public class QueryBuilder {
    private ArrayList<String> sectionID;
    private String email;
    private String phoneNumber;

    public QueryBuilder(String contact, boolean isEmail){
        if(isEmail){
            this.email = contact;
        }
        else{
            this.phoneNumber = contact;
        }
    }

    public void addSection(String section){
        sectionID.add(section);
    }

    public Query build(){
        return new Query(sectionID, email, phoneNumber);
    }


}
