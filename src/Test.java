public class Test {
    private static PhoneNumberRegex phoneNumberExample;
    public static final String[] validPhoneNumber = new String[] { "(04)-(0123456789)", "(22)-(0987654321)", "(12)-(0915271332)" };
    public static final String[] invalidPhoneNumber = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberRegex();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber +" is valid: "+ isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber +" is valid: "+ isvalid);
        }
    }
}
