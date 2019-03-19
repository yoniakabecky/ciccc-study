package MiniProject1;


import java.util.Objects;

public class Contact {
    private String myName;
    private String mobile;
    private String workPhone;
    private String homePhone;
    private String cityName;

    public Contact(String myName, String mobile, String workPhone, String homePhone, String cityName) {
        this.myName = myName;
        this.mobile = mobile;
        this.workPhone = workPhone;
        this.homePhone = homePhone;
        this.cityName = cityName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public String toString() {
        String info = "<" + myName + "> (Mobile: " + mobile;
        if (!workPhone.equals("")) {
            info += ", Phone(Work): " + workPhone;
        }
        if (!homePhone.equals("")) {
            info += ", Phone(Home): " + homePhone;
        }
        if (!cityName.equals("")) {
            info += ", City: " + cityName;
        }
        info += ")";

        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(myName, contact.myName) &&
                Objects.equals(mobile, contact.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myName, mobile);
    }
}
