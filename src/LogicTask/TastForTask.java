package LogicTask;

public class TastForTask {

        TastForTask(){
            if (Mainlogic.checkingForAnOrderedSequence(arr) ==false){
                System.out.println("test 0 - True");
            }
            if (Mainlogic.checkingForAnOrderedSequence(arr1) ==true){
                System.out.println("test 1 - True");
            }
            if (Mainlogic.checkingForAnOrderedSequence(arr2) ==false){
                System.out.println("test 2 - True");
            }
            if (Mainlogic.checkingForAnOrderedSequence(arr3) ==false){
                System.out.println("test 3 - True");
            }
            if (Mainlogic.checkingForAnOrderedSequence(arr4) ==false){
                System.out.println("test 4 - True");
            }
            if (Mainlogic.checkingForAnOrderedSequence(arr5) ==true){
                System.out.println("test 5 - True");
            }
        }

    public double[][] arr = {{1,2,3,4,5,6,7},{5,3,2,1,4,5,6},{1,1,1,1,1,1,1},{3,1,2,3,5,6,3},{4,2,3,4,5,1,7}};
    public double[][] arr1 = {{9,5,3,-7,-9},{7,1,-5,-11,-17},{-1,-3,-13,-15,-19}};
    public double[][] arr2 = {{1,2,3},{5,3,2},{1,1,1},{3,1,2},{4,2,3}};
    public double[][] arr3 = {{1},{2},{3},{4},{5}};
    public double[][] arr4 = {{1,2,3,4,5,6,7}};
    public double[][] arr5 = {{1},{2}};
}
