
package Model;


public class Member {
    String MemberID;
    String MemberName;
    String Birthdate;
    String Age;
    String Email;
    int Telephone;
    String membership;

    public Member() {
    }
    
    

    public Member(String MemberID, String MemberName, String Birthdate, String Age, String Email, int Telephone, String membership) {
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.Birthdate = Birthdate;
        this.Age = Age;
        this.Email = Email;
        this.Telephone = Telephone;
        this.membership = membership;
    }

    public Member(String MemberID, String MemberName, String Birthdate, String Email, int Telephone) {
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.Birthdate = Birthdate;
        this.Email = Email;
        this.Telephone = Telephone;
    }

 

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    
    
    
}
