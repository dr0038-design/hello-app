public class HelloApp
{
        public static void main(String[] args)
        {
                // if no arguments
                if (args.length == 0)
                {
                        System.out.println("Hello World");
                }
                else
                {
                        // loop for multiple names
                        for (int i = 0; i < args.length; i++)
                        {
                                System.out.println("Hello " + args[i]);
                        }
                }
        }
}