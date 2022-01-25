import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Panachai Sangsiri"); //PUT YOUR NAME HERE
        groupMembers.add("Pongsathon Kamlek");
        groupMembers.add("Supanan Ngoenchaem");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
