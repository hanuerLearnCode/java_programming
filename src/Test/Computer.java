package Test;

import java.util.List;
import java.util.Objects;

/**
 * @overview ...
 */
public class Computer {

    // this id should be auto-generated in the db
    // should change id to be something like manufactureCode
    private int id;
    private String model;
    private List<String> parts; // Ram, GPU, Chip, ...
    // code omit //

    public Computer() {

    }

    public Computer(int id, String model, List<String> parts) {
        this.setId(id);
        this.setModel(model);
        this.setParts(parts);
    }

    public int getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public List<String> getParts() {
        return this.parts;
    }

    public void setId(int id) {
        if (!isValidId(id)) {
            throw new IllegalArgumentException();
        }
        this.id = id;
    }

    public void setModel(String model) {
        if (!isValidModel(model)) {
            throw new IllegalArgumentException();
        }
        this.model = model;
    }

    public void setParts(List<String> parts) {
        if (!isValidParts(parts)) {
            throw new IllegalArgumentException();
        }
        this.parts = parts;
    }

    private boolean isValidId(int id) {
        return id > 0;
    }

    private boolean isValidModel(String model) {
        return !model.isEmpty() && model.length() < 20;
    }

    private boolean isValidParts(List<String> parts) {
        for (String part : parts) {
            if (part.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", parts=" + parts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return id == computer.id && Objects.equals(model, computer.model) && Objects.equals(parts, computer.parts);
    }

}

/**
 * We can add a constructor, ... to make the class fully functional
 */

