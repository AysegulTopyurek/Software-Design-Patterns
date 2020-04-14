package orneknesnehavuzu;

public class DoktorNotFoundException extends RuntimeException {
 
    private static final long serialVersionUID = -6670953536653728443L;
 
    public DoktorNotFoundException(String message) {
        System.out.println(message);
    }
}
