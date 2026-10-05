import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        ArrayCollection<Artifact> collection = new ArrayCollection<>();

        Artifact a1 = new Artifact("a101", "anciant vase", "greek");
        Artifact a2 = new Artifact("a102", "roman coin", "roman");
        Artifact a3 = new Artifact("a103", "golden mask", "egyptian");

        collection.add(a1);
        collection.add(a2);
        collection.add(a3);

        Artifact search = new Artifact("b205", "", "");

        System.out.println("found " + collection.find(search));
        System.out.println("contains " + collection.contains(search));

        collection.remove(search);

        System.out.println("after removal:");

        System.out.println("size " + collection.size());
        System.out.println("contains b205 " + collection.contains(search));

        ArrayList<Artifact> museumList = new ArrayList<>();
        museumList.add(new Artifact("04m", "artifact m", "modern"));
        museumList.add(new Artifact("a01", "artifact a", "ancient"));
        museumList.add(new Artifact("z99", "artifact z", "modern"));
        museumList.add(new Artifact("b12", "artifact b", "bronze age"));

        System.out.println("before sorting ");
        System.out.println(museumList);
        Collections.sort(museumList);
        System.out.println("after sorting ");
        System.out.println(museumList);
}
}
