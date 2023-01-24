package prototype;

public class PrototypeApplicationRunner {
    public static void main(String[] args) {
        Project original = new Project(1, "Prototype Application", "SourceCode of this project is here...");
        System.out.println(original);

        ProjectFactory factory = new ProjectFactory(original);
        Project originalClone = factory.cloneProject();

        System.out.println("\n-----------The copy of the original project is below----------\n");
        System.out.println(originalClone);
    }
}
