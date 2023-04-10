import java.util.ArrayList;
import java.util.Arrays;

public class Part3
{
    public static void insertName(ArrayList<String> names, String name)
    {
        for (int i = 0; i < names.size(); i++)
        {
            if (name.compareTo(names.get(i)) < 0)
            {
                names.set(i,name);
                break;
            }
        }
    }
    public static void arrayListRemove(ArrayList<Integer> nums, int value )
    {
        for (int i = nums.size()-1; i >=0 ; i--)
        {
            if (nums.get(i).intValue()== value)
            {
                nums.remove(i);
            }
        }
    }
    public static void main(String[] args)
    {
        ArrayList<String> names;
        names = new ArrayList<String>();
        names.add("Andrii");
        names.add("Badun");
        names.add("Clivlend");
        ArrayList<Integer> nums;
        nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        ArrayList<String> arr;
        arr = new ArrayList<String>();
        arr.add("bear");
        arr.add("boar");
        arr.add("lion");
        ArrayList<String> animals;
        animals = new ArrayList<String>();
        animals.add("rabbit");
        animals.add(1,"horse");
        System.out.println(animals.get(1));
        animals.set(1,"whale");
        animals.remove(1);
        animals.addAll(arr);
        System.out.println(animals);
        System.out.println(animals.indexOf("bear"));
        for (String species : animals)
        {
            System.out.println(species);
        }
        for (int i = 0; i < animals.size(); i++)
        {
            System.out.println(animals.get(i));
        }
        arrayListRemove(nums,1);
        System.out.println(nums);

    }

}
