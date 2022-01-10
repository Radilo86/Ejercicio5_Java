import java.util.List;

public class Coche {

    private String save;
    private String findAll;
    private String delete;

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public String getFindAll() {
        return findAll;
    }

    public void setFindAll(String findAll) {
        this.findAll = findAll;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
