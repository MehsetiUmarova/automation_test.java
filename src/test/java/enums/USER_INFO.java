package enums;

public enum USER_INFO {
    USER_MEHSETI("","");
    private final String email;
    private final String password;

    USER_INFO(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
