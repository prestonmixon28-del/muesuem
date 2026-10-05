public class Artifact {
    private String name;
    private String id;
    private String era;

    public Artifact(String name, String id, String era) {
        this.name = name;
        this.id = id;
        this.era = era;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEra() {
        return era;
    }

    @Override 
    public String toString() {
        return "Artifact{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", era='" + era + '\'' +
                '}';
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Artifact other = (Artifact) obj;
        return this.id.equals(other.id);
    }
}
