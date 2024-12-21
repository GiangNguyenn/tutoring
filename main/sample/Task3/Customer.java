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

        setPrivilege(inPrivilege);
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
        if(inEmail.length() > 125){
            return false;
        }

//        check if email splitted by "@" only contains 2 parts => only one "@"
        if(inEmail.split("@").length > 2){
            return false;
        }


        if(!inEmail.split("\\.")[1].equals(".com") || inEmail.split("\\.")[1].equals(".vn")){
            return false;
        }

        return true;
    }

    private boolean isValidName(String name) {
        // Check if the name contains at least 2 characters
        if (name.length() < 2) {
            return false;
        }

        // Check for leading or trailing spaces
        if (name.trim().length() != name.length()) {
            return false;
        }

        // Check if the name contains only alphabet characters (title case)
        if (!name.matches("^[A-Z][a-z]+( [A-Z][a-z]+)*$")) {
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
            customerId = 0;
        }
    }
}
