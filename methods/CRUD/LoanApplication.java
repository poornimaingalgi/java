class LoanApplication {
    static String applicantName;
    static String applicantEmail;
    static String applicantPhoneNumber;
    static double loanAmount;
    static String loanType;
    static String bankAccountNo;

    public static boolean createLoanApplication(String name, String email, String phone, double amount, String type, String accountNo) {
        boolean isApplicationCreated = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isAmountValid = false;
        boolean isTypeValid = false;
        boolean isAccountNoValid = false;

        if (name != null ){
            applicantName = name;
            isNameValid = true;
        } else {
            System.out.println("Please provide a valid Applicant Name");
        }

        if (email != null ) {
            applicantEmail = email;
            isEmailValid = true;
        } else {
            System.out.println("Please provide a valid Email");
        }

        if (phone != null ) {
            applicantPhoneNumber = phone;
            isPhoneValid = true;
        } else {
            System.out.println("Please provide a valid Phone Number");
        }

        if (amount > 0) {
            loanAmount = amount;
            isAmountValid = true;
        } else {
            System.out.println("Please provide a valid Loan Amount");
        }

        if (type != null ) {
            loanType = type;
            isTypeValid = true;
        } else {
            System.out.println("Please provide a valid Loan Type");
        }

        if (accountNo != null ) {
            bankAccountNo = accountNo;
            isAccountNoValid = true;
        } else {
            System.out.println("Please provide a valid Bank Account Number");
        }

        if (isNameValid && isEmailValid && isPhoneValid && isAmountValid && isTypeValid && isAccountNoValid) {
            isApplicationCreated = true;
        }

        return isApplicationCreated;
    }

    public static void getLoanApplicationDetails() {
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Applicant Email: " + applicantEmail);
        System.out.println("Applicant Phone Number: " + applicantPhoneNumber);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Bank Account Number: " + bankAccountNo);
    }

    
}
