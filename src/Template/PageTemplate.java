package src.Template;

public class PageTemplate {
    protected void displayHeader() {
        System.out.println("This is Header Page");
    }

    protected void displayBody() {
        System.out.println("Body");
    }

    protected void displayFooter() {
        System.out.println("Footer");
    }

    protected void displayNavigation() {
        System.out.println("Navigation");
    }

    // template methods
    public void displayPage() {
        // dinh nghia thuc thi thuat toan
        displayHeader();
        displayNavigation();
        displayBody();
        displayFooter();
    }

}
