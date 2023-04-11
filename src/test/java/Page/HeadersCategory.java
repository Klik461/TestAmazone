package Page;

public enum HeadersCategory {

    WOMEN("1"),
    MEN("2"),
    KIDS("3"),
    NEW_ARRIVALS("4"),
    VANS_X_HARIBO("5"),
    CUSTOMS("6"),
    SKATEBOARDING("7"),
    MORE("8");

    HeadersCategory(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
