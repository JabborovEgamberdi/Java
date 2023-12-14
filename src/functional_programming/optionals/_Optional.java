package functional_programming.optionals;

public class _Optional {
    public static void main(String[] args) {

        Object value = java.util.Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
        System.out.println(value);

        java.util.Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Can not send email");
                        });
    }
}