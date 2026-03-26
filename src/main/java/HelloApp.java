public class HelloApp {

        public static void main(String[] args) {

                // check if no arguments
                if (args.length == 0) {
                        System.out.println("Hello, World!");
                }
                else {

                        // enhanced for loop
                        for (String name : args) {
                                System.out.println("Hello " + name);
                        }

                }
        }
}