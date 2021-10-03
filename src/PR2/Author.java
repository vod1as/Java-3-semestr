package PR2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String j, char a) {
        name = n;
        email = j;
        gender = a;
    }

    public String getName(String name){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(String email){
        return name;
    }

    public String getGender(char gender) {
        return name;
    }

    public String toString(){
        return this.name+",email:"+this.email+",gender:"+this.gender;
    }
}
