package sample.Task3;


public class Customer {
    private String name;
    private String email;
    private int customerId;
    private Privilege privilege;

    public Customer(String inName, int inCustomerId, String inEmail, Privilege inPrivilege) {
        setName(inName);
        setCustomerId(inCustomerId);
        setEmail(inEmail);
        this.privilege = inPrivilege;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public String getEmail() {
        return email;
    }

    public static boolean isTitlecase(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        char[] chars = str.toCharArray();
        boolean isFirstChar = true;

        for (char c : chars) {
            if (isFirstChar) {
                if (!Character.isUpperCase(c)) {
                    return false;
                }
                isFirstChar = false;
            } else {
                if (!Character.isLowerCase(c)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidName(String inName) {
        // Check if the name contains at least 2 characters
        if (inName.length() < 2) {
            return false;
        }

        // Check for leading or trailing spaces
        if (inName.trim().length() != inName.length()) {
            return false;
        }

        // Check if the name contains only alphabet characters (title case)
//        if (!name.matches("^[A-Z][a-z]+( [A-Z][a-z]+)*$")) {
//            return false;
//        }
        // check if any character is number ==> name invalid
        for (int i = 0; i < inName.length(); i++) {
            if (Character.isDigit(inName.charAt(i))==true){
                return false;
            }
        }

        if(!isTitlecase(inName)){
            return false;
        }

        return true;
    }

    public void setName(String inName) {
        if (isValidName(inName)) {
            name = inName;
        } else {
            name = "ERROR";
        }
    }


    public void setPrivilege(Privilege inPrivilege) {
        privilege = inPrivilege;
    }

    public void setEmail(String inEmail) {
        if (isValidEmail(inEmail)) {
            email = inEmail;
        } else {
            email = "ERROR";
        }
    }

    private boolean isValidEmail(String inEmail) {
        // check if email exceed 125
        if (inEmail.length() > 125) {
            return false;
        }

//      // check if email split by "@" only contains 2 parts => only one "@"
        if (inEmail.split("@").length > 2) {
            return false;
        }

        // split  string ==> String[]
        if (!inEmail.split(".")[1].equals("vn")) {
            return false;
        }

        if (!inEmail.split(".")[1].equals("com")){
            return false;
        }

        return true;
    }

    private boolean isValidCustomerId(int inCustomerId) {
        if (inCustomerId < 0) {
            return false;
        }

        for(int i = 0; i < String.valueOf(inCustomerId).length(); i++) {
            if (!Character.isDigit(String.valueOf(inCustomerId).charAt(i))) {
                return false;
            }
        }

        if (String.valueOf(inCustomerId).length() != 8) {
            return false;
        }
        return true;
    }

    public void setCustomerId(int inCustomerId) {
        if (isValidCustomerId(inCustomerId)) {
            customerId = inCustomerId;
        }
        else{
            customerId = -1;
        }
    }
}
