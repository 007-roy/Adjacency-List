package Adjacent_List;
import java.util.ArrayList;


public class Adjacent_List {
    static void addEdge(ArrayList<ArrayList<Integer>> al, int i, int j){
        al.get(i).add(j);
        al.get(j).add(i);
    }

    static void printarray(ArrayList<ArrayList<Integer>> al){
        for (int i = 0; i < al.size();i++){
            System.out.println("\nVertex " + i + " :");
            for (int j = 0; j < al.get(i).size(); j++){
                System.out.print("--> " + al.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int V = 4;

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0; i < V;i++)
            al.add(new ArrayList<>());

        addEdge(al,0,1);
        addEdge(al,0,2);
        addEdge(al,0,3);
        addEdge(al,1,2);

        printarray(al);
    }

}