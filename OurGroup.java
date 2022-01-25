import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Panachai Sangsiri"); //PUT YOUR NAME HERE
        groupMembers.add("Pongsathon Kamlek");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
