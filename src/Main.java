import java.util.ArrayList;
import java.util.Scanner;

class ListMaker
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        boolean proper = false;
        do {

            while(true)
            {
                //initiates scanner
                Scanner scan = new Scanner(System.in);

                // list functions
                String result = ("\n" +
                        "List HandBook:\n" +
                        " A- (adds an item to the list)," +
                        "\n D- (removes an item from the list)," +
                        "\n P- (Prints out the list)," +
                        "\n Q- (Closes the program)" + "\n" + list);


                String c = "[AaDdPpQq]";
                String InputA = SafeInput.getRegExString(scan, result, c);

                // Prevent redundant bulletproofing
                InputA = InputA.toLowerCase();

                switch (InputA)
                {
                    case "a":
                        list.add(add(list));
                        break;
                    case "d":
                        list.remove(delete(list));
                        break;
                    case "p":
                        display(list);
                        break;
                    case "q":



                        boolean retVal = true;
                        boolean listy = false;
                        String theA = "";

                        // Exit array
                        do
                        {
                            String verify = "Are you sure you want to exit out of the list";
                            System.out.print("\n" + " Enter [ Y/N ] to confirm your leave " + verify);

                            //allows for input
                            scan = new Scanner(System.in);
                            theA = scan.nextLine();


                            if(theA.equalsIgnoreCase("Y"))
                            {
                                System.exit(0);
                            }
                            else if
                            (theA.equalsIgnoreCase("N"))
                            {
                                break;
                            }
                            else
                            {
                                System.out.println(" Enter [ Y/N ] to proceed not " + theA + " Is the wrong input" );
                            }

                        }while(!listy);

                        break;
                    default:

                        //Bullet proofing
                        System.out.println("Wrong input! Please enter one of these options" +
                                "[ A, D, P, or Q ] " + result);
                }

            }

        } while (!proper);

    }
                //adds list
                        private static String add(ArrayList<String> list)
                 {
                  Scanner pipe = new Scanner(System.in);
                String answer = SafeInput.getNonZeroLengthString(pipe, "What do you want to add from the array list");
                return answer;
                    }
                    //removes list
                    private static String delete(ArrayList<String> list)
                    {
                        Scanner pipe = new Scanner(System.in);
                        String remove = SafeInput.getNonZeroLengthString(pipe,
                                "What do you want to remove/delete from the array list?");
                        return remove;
                    }
                    //displays list
                        private static void display(ArrayList<String> list){
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            for (String cartage: list)
                            {
                                System.out.println(cartage);
                            }
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        }
                    }