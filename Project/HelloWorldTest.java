public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorld user = new HelloWorld();
       
        user.setName("Mohammed");
        user.setDescription("developer");
        String username = user.getName();
        String career = user.getDescription();
        
        System.out.println("Bike object - Name: " + username );
        System.out.println(" MyCareer is: " + career);
    }
}