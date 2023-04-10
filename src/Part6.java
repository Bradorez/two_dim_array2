public class Part6
{

        private static int instanceCounter = 0;// Shouldnt be allowed to manipulate not in class, its only should increments with
    // creating new instance.


        private static void incrementCount()// process of incrementing shouldnt be changed.
        {
            instanceCounter+=1;
        }


        public Part6()
        {
            incrementCount();
            System.out.println("Instance count: " + instanceCounter);
        }

        public static int getInstanceCount()//the way we can know actual count of instances. private will block this function.
        {
            return instanceCounter;
        }


    public static void main(String[] args)
    {
        Part6 counter1 = new Part6();
        Part6 counter2 = new Part6();
        Part6 counter3 = new Part6();
        int totalInstances  = Part6.getInstanceCount();

        System.out.println("Total count of objects: " + totalInstances );
    }




}
