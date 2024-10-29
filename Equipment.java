public class Equipment {
    public enum EquipmentState { NEW, USED, MAINTENANCE }

    private final String name;
    private boolean isAvailable;
    private EquipmentState state;

    public Equipment(String name, EquipmentState state) {
        this.name = name;
        this.state = state;
        this.isAvailable = (state != EquipmentState.MAINTENANCE); // Não disponível se estiver em manutenção
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable && state != EquipmentState.MAINTENANCE;
    }

    public EquipmentState getState() {
        return state;
    }

    public void setState(EquipmentState state) {
        this.state = state;
        if (state == EquipmentState.MAINTENANCE) {
            this.isAvailable = false;
        }
    }

    public void borrow() {
        if (state != EquipmentState.MAINTENANCE) {
            isAvailable = false;
        }
    }

    public void returnEquipment() {
        if (state != EquipmentState.MAINTENANCE) {
            isAvailable = true;
        }
    }

    public void displayInfo() {
        System.out.println("[Equipamento: " + name + " || Estado: " + state + 
                           " || Disponível: " + (isAvailable ? "Sim" : "Não") + "]");
    }
}
