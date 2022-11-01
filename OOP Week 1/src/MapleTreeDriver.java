import java.util.*;
public class MapleTreeDriver {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        MapleTree userTree = new MapleTree();
        
        userTree.setPlanting();
        userTree.setGermination();
        userTree.dumpData();
        
        stdIn.close();
    }

}


