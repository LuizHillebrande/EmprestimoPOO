public class Equipment {
    private final String name;
    private boolean isAvailable;

    public Equipment(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnEquipment() {
        isAvailable = true;
    }
}
