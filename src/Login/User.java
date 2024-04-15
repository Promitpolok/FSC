package Login;

import java.io.Serializable;

/**
 *
 * @author Promit
 */
public class User implements Serializable{
    String Name;
    int ID;
    String Password;
    String SelectUser;

    public User(String Name, int ID, String Password, String SelectUser) {
        this.Name = Name;
        this.ID = ID;
        this.Password = Password;
        this.SelectUser = SelectUser;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getSelectUser() {
        return SelectUser;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSelectUser(String SelectUser) {
        this.SelectUser = SelectUser;
    }
    
    
}
