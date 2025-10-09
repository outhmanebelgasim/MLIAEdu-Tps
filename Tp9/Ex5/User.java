package Tp9.Ex5;

import java.util.Objects;

public class User {
	private int id;
    private String name;

    public User(int id, String name) {
        this.id = id; this.name = name;
    }

    public int getId()   { return id; }
    public String getName(){ return name; }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        return id == ((User)o).id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return name + " [#" + id + "]";
    }
}
