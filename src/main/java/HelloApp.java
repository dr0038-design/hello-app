public class HelloApp {

        public static void main(String[] args)
        {
            // check if name is given
            if(args.length > 0)
            {
                System.out.println("Hello " + args[0]);
            }
            else
            {
                System.out.println("Hello User");
            }
        }

}
